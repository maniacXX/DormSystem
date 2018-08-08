package com.duan.dormitorysystem.controller;

import com.duan.dormitorysystem.bean.Msg;
import com.duan.dormitorysystem.bean.StuRelationInter;
import com.duan.dormitorysystem.service.inter.StuRelationInterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author Administrator
 * @date 2018/8/8 16:00
 */

@Controller
@RequestMapping("/inter")
public class StuRelationInterController {

    @Autowired
    StuRelationInterService stuRelationInterService;

    /**
     * 检查对应学生id是否有对应的兴趣已经存入
     * @param stuId 学生id
     * @return 存在状态
     */
    @RequestMapping(value = "/check/{stuId}",method = RequestMethod.GET)
    @ResponseBody
    public Msg check(@PathVariable("stuId") long stuId){
        if(stuRelationInterService.check(stuId)){
            return Msg.success();
        }else {
            return Msg.fail();
        }
    }

    /**
     * * 添加一组新的学生与兴趣的关联
     * @param message stuId-inter
     * @return 状态
     */
    @RequestMapping(value = "/add/{message}",method = RequestMethod.POST)
    @ResponseBody
    public Msg add(@PathVariable("message") String message){
        String[] infos=message.split("-");

        stuRelationInterService.add(new StuRelationInter(null,Long.parseLong(infos[0]),infos[1],new Date(),new Date()));

        return Msg.success();
    }
}
