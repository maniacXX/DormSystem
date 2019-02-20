package com.duan.dormitorysystem.controller;

import com.duan.dormitorysystem.bean.Building;
import com.duan.dormitorysystem.service.inter.BuildingService;
import com.duan.dormitorysystem.service.inter.JedisService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.duan.dormitorysystem.bean.Msg;

import java.util.*;

import static com.duan.dormitorysystem.util.SerializeUtil.*;

/**
 * @author Duan
 * @date 2018/6/28 13:30
 */
@Controller
@RequestMapping("/building")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @Autowired
    private JedisService jedisService;



    /**
     * 通过寝室id返回寝室信息
     *
     * @param id 寝室id
     * @return 寝室信息
     */
    @RequestMapping(value = "/getdorm/{id}")
    @ResponseBody
    public Msg getDormById(@PathVariable("id") long id) {
        // 取值,若redis中存在，直接取
        if(jedisService.keyExists(String.valueOf(id))) {
            Building building = (Building) unserizlize((byte[]) jedisService.getObject(String.valueOf(id)));
            return Msg.success().add("dorm", building);
        }
        Building building = buildingService.getDormById(id);
        return Msg.success().add("dorm", building);
    }

    /**
     * 拿到对应页数的寝室数据
     *
     * @param pn 页数
     * @return
     */
    @RequestMapping("/all")
    @ResponseBody
    public Msg getAll(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
        //引入分页插件并调用,传入页码和每页的数据个数
        PageHelper.startPage(pn, 8);

        List<Building> buildings = buildingService.getAll();

        PageInfo<Building> page = new PageInfo<Building>(buildings, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 通过楼栋号与寝室号查找寝室信息(优先访问redis)
     *
     * @param info 楼栋号-寝室号
     * @return 寝室对象
     */
    @RequestMapping(value = "/getbuilding/{info}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getDormByInfo(@PathVariable("info") String info) {
        String[] infos = info.split("-");
        // 取值,若存在，直接取
        if(jedisService.keyExists(infos[0]+"-"+infos[1])) {
            Building building = (Building)unserizlize((byte[]) jedisService.getObject(jedisService.getString(infos[0]+"-"+infos[1])));
            return Msg.success().add("building", building);
        }
        Building building = buildingService.getDormByinfo(infos[0], infos[1]);
        return Msg.success().add("building", building);
    }

    /**
     * 寝室床位状态置零
     *
     * @param info 寝室号-床位号
     * @return
     */
    @RequestMapping(value = "/cancel/{info}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg cancelBed(@PathVariable("info") String info) {
        String[] infos = info.split("-");
        Building building = buildingService.getDormById(Long.parseLong(infos[0]));
        if (infos[1].equals("1")) {
            building.setDorm1Bed((byte) 0);
        } else if (infos[1].equals("2")) {
            building.setDorm2Bed((byte) 0);
        } else if (infos[1].equals("3")) {
            building.setDorm3Bed((byte) 0);
        } else if (infos[1].equals("4")) {
            building.setDorm4Bed((byte) 0);
        } else if (infos[1].equals("5")) {
            building.setDorm5Bed((byte) 0);
        } else {
            building.setDorm6Bed((byte) 0);
        }
        building.setDormCurrentPeople((byte) (building.getDormCurrentPeople()-(byte)1));
        buildingService.cancel(building);
        // 若redis中存在，从redis中删除寝室
        if(jedisService.keyExists(String.valueOf(building.getDormId())) ){
            jedisService.deleteKey(String.valueOf(building.getDormId()));
            jedisService.deleteKey(building.getBuildingNumber()+"-"+building.getDormNumber());

        }
        return Msg.success();
    }

    /**
     * 寝室床位状态选择
     *
     * @param info 寝室号-床位号
     * @return
     */
    @RequestMapping(value = "/pick/{info}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg pickBed(@PathVariable("info") String info) {
        String[] infos = info.split("-");

        Building building = buildingService.getDormById(Long.parseLong(infos[0]));
        if (infos[1].equals("1")) {
            building.setDorm1Bed((byte) 1);
        } else if (infos[1].equals("2")) {
            building.setDorm2Bed((byte) 1);
        } else if (infos[1].equals("3")) {
            building.setDorm3Bed((byte) 1);
        } else if (infos[1].equals("4")) {
            building.setDorm4Bed((byte) 1);
        } else if (infos[1].equals("5")) {
            building.setDorm5Bed((byte) 1);
        } else {
            building.setDorm6Bed((byte) 1);
        }

        building.setDormCurrentPeople((byte) (building.getDormCurrentPeople()+(byte)1));
        buildingService.pick(building);

        //选中寝室存入redis,若存在当做为更新
        jedisService.setObject(String.valueOf(building.getDormId()),building);
        jedisService.setString(building.getBuildingNumber()+"-"+building.getDormNumber(),String.valueOf(building.getDormId()));


        return Msg.success();
    }

    /**
     * 获取所有寝室，并放入map
     * @return 寝室信息
     */
    @RequestMapping(value = "/mapAll",method = RequestMethod.GET)
    @ResponseBody
    public Msg getMapAll(){
        List<Building> list=buildingService.getAll();

        return Msg.success().add("building",list);
    }

    /**
     * 新添加一个房间
     * @param message 房间信息
     * @return 添加是否成功
     */
    @RequestMapping(value = "/add/{message}",method = RequestMethod.POST)
    @ResponseBody
    public Msg add(@PathVariable("message") String message){
        String[] infos=message.split("-");

        //房间查重，重复就不添加，返回失败
        if(buildingService.checkRepeat(infos[0],infos[1])){
            return Msg.fail();
        }

        Byte b=new Byte("0");
        Building building=new Building(null,infos[0],infos[1],Byte.parseByte(infos[2]),b,b,b,b,b,b,b,new Date(),new Date());

        buildingService.add(building);

        return Msg.success();
    }

    /**
     * 修改房间信息
     * @param message 房间信息
     * @return 修改状态
     */
    @RequestMapping(value = "/update/{message}",method = RequestMethod.PUT)
    @ResponseBody
    public Msg update(@PathVariable("message") String message){
        String[] infos=message.split("-");

        //房间查重，重复就不修改，返回失败
        if(buildingService.checkRepeat(infos[1],infos[2])){
            return Msg.fail();
        }

        Building building=buildingService.getDormById(Long.parseLong(infos[0]));
        String oldNum=building.getBuildingNumber()+"-"+building.getDormNumber();
        building=new Building(Long.parseLong(infos[0]),infos[1],infos[2],null,null,null,null,null,null,null,null,new Date(),new Date());

        buildingService.update(building);

        // redis中若存在该寝室，更新寝室状态
        if(jedisService.keyExists(String.valueOf(building.getDormId()))) {
            building=buildingService.getDormById(Long.parseLong(infos[0]));
            jedisService.setObject(String.valueOf(building.getDormId()),building);
            jedisService.setString(building.getBuildingNumber()+"-"+building.getDormNumber(),String.valueOf(building.getDormId()));
            jedisService.deleteKey(oldNum);
        }

        return Msg.success();
    }

    /**
     * 删除房间
     * @param id 房间id
     * @return 状态
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteById(@PathVariable("id") long id){
        if(jedisService.keyExists(String.valueOf(id))){
            Building building=buildingService.getDormById(id);
            jedisService.deleteKey(String.valueOf(id));
            jedisService.deleteKey(building.getBuildingNumber()+"-"+building.getDormNumber());
        }
        buildingService.deleteById(id);
        return Msg.success();
    }

    /**
     * 检查是否可以修改，若可以，直接修改
     * @param message 房间信息
     * @return 状态
     */
    @RequestMapping(value = "/checkAvai/{message}",method = RequestMethod.PUT)
    @ResponseBody
    public Msg checkAvai(@PathVariable("message") String message){
        String[] infos=message.split("-");

        Building building=buildingService.getDormByinfo(infos[0],infos[1]);

        if (building==null){
            return Msg.fail().add("reason",0);
        }else if(Integer.parseInt(infos[2])>building.getDormMaxPeople()){
            return Msg.fail().add("reason",1);
        }else if((building.getDorm1Bed()==(byte)1&&infos[2].equals("1"))||
                (building.getDorm2Bed()==(byte)1&&infos[2].equals("2"))||
                (building.getDorm3Bed()==(byte)1&&infos[2].equals("3"))||
                (building.getDorm4Bed()==(byte)1&&infos[2].equals("4"))||
                (building.getDorm5Bed()==(byte)1&&infos[2].equals("5"))||
                (building.getDorm6Bed()==(byte)1&&infos[2].equals("6"))){
            return Msg.fail().add("reason",2);
        }else {
            if (infos[2].equals("1")){
                building.setDorm1Bed((byte) 1);
            }else if (infos[2].equals("2")){
                building.setDorm2Bed((byte) 1);
            }else if (infos[2].equals("3")){
                building.setDorm3Bed((byte) 1);
            }else if (infos[2].equals("4")){
                building.setDorm4Bed((byte) 1);
            }else if (infos[2].equals("5")){
                building.setDorm5Bed((byte) 1);
            }else{
                building.setDorm6Bed((byte) 1);
            }

            building.setDormCurrentPeople((byte) (building.getDormCurrentPeople()+1));

            // redis中若存在该寝室，更新寝室状态
            if(jedisService.keyExists(String.valueOf(building.getDormId()))) {
                jedisService.setObject(String.valueOf(building.getDormId()),building);
            }
            buildingService.update(building);

            return Msg.success().add("dormId",building.getDormId());
        }
    }

    /**
     * 将寝室保存到redis中（键是寝室id，值是序列化的推荐寝室集合）
     * @param ids 寝室id串
     * @return 状态
     */
    @ResponseBody
    @RequestMapping(value = "/saveRecom/{ids}",method = RequestMethod.POST)
    public Msg testJedisClient(@PathVariable("ids") String ids) {
        // 把推荐寝室都存入redis
        String[] strings=ids.split(",");
        for (int i=0;i<strings.length;i++){
            String[] strings1=strings[i].split("-");
            Building building=buildingService.getDormByinfo(strings1[0],strings1[1]);
           jedisService.setObject(String.valueOf(building.getDormId()),building);
            //可以用楼栋号-寝室号直接找到寝室号，方便传入另一种主属性时查找redis
            jedisService.setString(building.getBuildingNumber()+"-"+building.getDormNumber(),String.valueOf(building.getDormId()));
        }
        return Msg.success();
    }


}
