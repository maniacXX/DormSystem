package com.duan.dormitorysystem.controller;

import com.duan.dormitorysystem.bean.Building;
import com.duan.dormitorysystem.service.inter.BuildingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.duan.dormitorysystem.bean.Msg;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Duan
 * @date 2018/6/28 13:30
 */
@Controller
@RequestMapping("/building")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    /**
     * 通过寝室id返回寝室信息
     *
     * @param id 寝室id
     * @return 寝室信息
     */
    @RequestMapping(value = "/getdorm/{id}")
    @ResponseBody
    public Msg getDormById(@PathVariable("id") long id) {
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
     * 通过楼栋号与寝室号查找寝室信息
     *
     * @param info 楼栋号-寝室号
     * @return 寝室对象
     */
    @RequestMapping(value = "/getbuilding/{info}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getDormByInfo(@PathVariable("info") String info) {
        String[] infos = info.split("-");
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
        Building building = new Building();
        building.setDormId(Long.parseLong(infos[0]));
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
        buildingService.cancel(building);
        return Msg.success();
    }

    /**
     * 寝室床位状态置一并保存信息到session
     *
     * @param info 寝室号-床位号
     * @return
     */
    @RequestMapping(value = "/pick/{info}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg pickBed(@PathVariable("info") String info, HttpSession session) {
        String[] infos = info.split("-");
        Building building = new Building();
        building.setDormId(Long.parseLong(infos[0]));
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
        buildingService.pick(building);

        return Msg.success();
    }

}
