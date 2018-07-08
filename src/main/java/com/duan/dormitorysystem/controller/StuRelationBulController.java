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

import java.lang.reflect.Type;
import java.util.Date;
import java.util.List;

/**
 * @author Duan
 * @date 2018/6/29 9:30
 */
@Controller
@RequestMapping("/relation")
public class StuRelationBulController {
    @Autowired
    StuRelationBulService stuRelationBulService;

    /**
     * 通过学生id获得学生与寝室的关联信息
     * @param stuId
     * @return
     */
    @RequestMapping(value = "/studorm/{stuId}")
    @ResponseBody
    public Msg getInfoByStuId(@PathVariable("stuId") long stuId){
        StuRelationBul info=stuRelationBulService.getInfoByStuId(stuId);

        if (info==null){
            return Msg.fail();
        }else {
            return Msg.success().add("info",info);
        }
    }


    /**
     * 删除
     * @param id 主键
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteById(@PathVariable("id") long id){
        stuRelationBulService.deleteById(id);
        return Msg.success();
    }

    /**
     * 新增
     * @param info 信息
     * @return
     */
    @RequestMapping(value = "/add/{info}",method = RequestMethod.GET)
    @ResponseBody
    public Msg add(@PathVariable("info") String info){
        String[] infos=info.split("-");
        StuRelationBul stuRelationBul=new StuRelationBul();
        stuRelationBul.setDormId(Long.parseLong(infos[0]));
        stuRelationBul.setStuId(Long.parseLong(infos[1]));
        stuRelationBul.setBedNum(Byte.parseByte(infos[2]));
        stuRelationBul.setGmtCreate(new Date());
        stuRelationBul.setGmtModified(new Date());
        stuRelationBulService.add(stuRelationBul);
        return Msg.success();
    }


    /**
     * 通过寝室id获得学生与寝室的关联信息
     * @param dormId 寝室号
     * @return
     */
    @RequestMapping(value = "/getInfos/{dormId}")
    @ResponseBody
    public Msg getInfoByDormId(@PathVariable("dormId") long dormId){
        List<StuRelationBul> list=stuRelationBulService.getInfoByDormId(dormId);
        
        StuRelationBul[] SRBs = new StuRelationBul[list.size()];
        list.toArray(SRBs);
        return Msg.success().add("SRBs",SRBs).add("arrLength",SRBs.length);
    }
}
