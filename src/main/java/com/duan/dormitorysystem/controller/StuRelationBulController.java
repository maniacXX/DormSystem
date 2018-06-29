package com.duan.dormitorysystem.controller;

import com.duan.dormitorysystem.bean.StuRelationBul;
import com.duan.dormitorysystem.bean.Msg;
import com.duan.dormitorysystem.service.inter.StuRelationBulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Duan
 * @date 2018/6/29 9:30
 */
@Controller
@RequestMapping("/relation")
public class StuRelationBulController {
    @Autowired
    StuRelationBulService stuRelationBulService;

    @RequestMapping(value = "/studorm/{stuId}")
    @ResponseBody
    public Msg getInfoByStuId(@PathVariable("stuId") long stuId){
        StuRelationBul info=stuRelationBulService.getInfoByStuId(stuId);

        if (info==null){
            return Msg.fail();
        }else {
            return Msg.success().add("dormId",info.getDormId()).add("bedNum",info.getBedNum());
        }
    }
}
