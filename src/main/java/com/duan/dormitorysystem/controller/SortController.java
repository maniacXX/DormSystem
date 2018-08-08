package com.duan.dormitorysystem.controller;

import com.duan.dormitorysystem.bean.Building;
import com.duan.dormitorysystem.bean.Msg;
import com.duan.dormitorysystem.bean.StuRelationBul;
import com.duan.dormitorysystem.service.inter.BuildingService;
import com.duan.dormitorysystem.service.inter.StuRelationBulService;
import com.duan.dormitorysystem.service.inter.StudentService;
import com.duan.dormitorysystem.util.MyComparator2;
import com.duan.dormitorysystem.util.MyComparator3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @author Duan
 * @date 2018/8/8 14:49
 */

@Controller
@RequestMapping("/sort")
public class SortController {

    @Autowired
    private StuRelationBulService stuRelationBulService;

    @Autowired
    private BuildingService buildingService;

    @RequestMapping(value = "/sortStu", method = RequestMethod.PUT)
    @ResponseBody
    public Msg sortData() {

        //获取所有关联与寝室信息
        List<StuRelationBul> listSRB = stuRelationBulService.getAll();
        List<Building> listB = buildingService.getAll();

        //排序整合
        Collections.sort(listSRB,new MyComparator2());
        Collections.sort(listB,new MyComparator3());

        Iterator<StuRelationBul> iteratorSRB = listSRB.iterator();
        Iterator<Building> iteratorB = listB.iterator();

        //旧的关联全部删除
        while (iteratorSRB.hasNext()){
            stuRelationBulService.deleteById(iteratorSRB.next().getRelationId());
        }
        //旧的床位情况全部清空
        while (iteratorB.hasNext()){
            Building building=iteratorB.next();
            System.out.println(building.getDormNumber());
            building.setDormCurrentPeople((byte)0);
            building.setDorm1Bed((byte)0);
            building.setDorm2Bed((byte)0);
            building.setDorm3Bed((byte)0);
            building.setDorm4Bed((byte)0);
            building.setDorm5Bed((byte)0);
            building.setDorm6Bed((byte)0);
            buildingService.update(building);
        }

        //迭代器回到头部
        iteratorSRB = listSRB.iterator();
        iteratorB = listB.iterator();

        //开始重新整理寝室
        while (iteratorB.hasNext()){

            Building building=iteratorB.next();
            int total=building.getDormMaxPeople();
            byte t=1;

            while (total>0){
                if(iteratorSRB.hasNext()){
                    StuRelationBul stuRelationBul=iteratorSRB.next();
                    stuRelationBul.setBedNum(t);
                    stuRelationBul.setDormId(building.getDormId());
                    stuRelationBul.setGmtModified(new Date());
                    stuRelationBul.setGmtCreate(new Date());
                    stuRelationBulService.add(stuRelationBul);
                    if (t==(byte) 1){
                        building.setDorm1Bed((byte) 1);
                    }else if (t==(byte) 2){
                        building.setDorm2Bed((byte) 1);
                    }else if (t==(byte) 3){
                        building.setDorm3Bed((byte) 1);
                    }else if (t==(byte) 4){
                        building.setDorm4Bed((byte) 1);
                    }else if (t==(byte) 5){
                        building.setDorm5Bed((byte) 1);
                    }else{
                        building.setDorm6Bed((byte) 1);
                    }
                    building.setDormCurrentPeople((byte)(building.getDormCurrentPeople()+1));
                }
                total--;
                t++;
            }

            //更新寝室信息
            building.setGmtCreate(new Date());
            building.setGmtModified(new Date());
            buildingService.update(building);

            //学生提前整理完就提前退出
            if(!iteratorSRB.hasNext()){
                break;
            }
        }

        return Msg.success();
    }
}
