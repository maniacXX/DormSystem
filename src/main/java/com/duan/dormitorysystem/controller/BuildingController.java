package com.duan.dormitorysystem.controller;

import com.duan.dormitorysystem.bean.Building;
import com.duan.dormitorysystem.service.inter.BuildingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.duan.dormitorysystem.bean.Msg;

import java.util.List;

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
     * @param id 寝室id
     * @return 寝室信息
     */
    @RequestMapping(value = "/getdorm/{id}")
    @ResponseBody
    public Msg getDormById(@PathVariable("id") long id){
        Building building=buildingService.getDormById(id);
        return Msg.success().add("dorm",building);
    }

    /**
     * 拿到对应页数的寝室数据
     * @param pn 页数
     * @return
     */
    @RequestMapping("/all")
    @ResponseBody
    public Msg getAll(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        //引入分页插件并调用,传入页码和每页的数据个数
        PageHelper.startPage(pn,8);

        List<Building> buildings=buildingService.getAll();

        PageInfo<Building> page=new PageInfo<Building>(buildings,5);

        return Msg.success().add("pageInfo",page);
    }

    /**
     * 通过楼栋号与寝室号查找寝室信息
     * @param info 楼栋号-寝室号
     * @return 寝室对象
     */
    @RequestMapping(value = "/getbuilding/{info}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getDormByInfo(@PathVariable("info") String info){
        String[] infos=info.split("-");
        Building building=buildingService.getDormByinfo(infos[0],infos[1]);
        return Msg.success().add("building",building);
    }
}
