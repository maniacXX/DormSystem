package com.duan.dormitorysystem.service.impl;

import com.duan.dormitorysystem.bean.StuRelationBul;
import com.duan.dormitorysystem.bean.StuRelationBulExample;
import com.duan.dormitorysystem.dao.StuRelationBulMapper;
import com.duan.dormitorysystem.service.inter.StuRelationBulService;
import com.duan.dormitorysystem.util.MyComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/6/29 8:58
 */
@Service
public class StuRelationBulServiceImpl implements StuRelationBulService{

    @Autowired
    StuRelationBulMapper stuRelationBulMapper;

    /**
     * 通过学生id返回关联信息
     * @param stuId
     * @return
     */
    public StuRelationBul getInfoByStuId(long stuId) {
        StuRelationBulExample example=new StuRelationBulExample();
        StuRelationBulExample.Criteria criteria=example.createCriteria();
        criteria.andStuIdEqualTo(stuId);
        List<StuRelationBul> list=stuRelationBulMapper.selectByExample(example);
        if (list.isEmpty()){
            return null;
        }else {
            return list.get(0);
        }

    }

    /**
     * 删除
     * @param id 主键
     */
    public void deleteById(long id) {
        stuRelationBulMapper.deleteByPrimaryKey(id);
    }

    /**
     * 新增
     * @param stuRelationBul 新增的对象
     */
    public void add(StuRelationBul stuRelationBul) {
        stuRelationBulMapper.insertSelective(stuRelationBul);
    }

    /**
     * 通过寝室id获得学生与寝室的关联信息
     * @param dormId 寝室号
     * @return
     */
    public List<StuRelationBul> getInfoByDormId(long dormId) {
        StuRelationBulExample stuRelationBulExample=new StuRelationBulExample();
        StuRelationBulExample.Criteria criteria=stuRelationBulExample.createCriteria();
        criteria.andDormIdEqualTo(dormId);
        List<StuRelationBul> list=stuRelationBulMapper.selectByExample(stuRelationBulExample);
        Collections.sort(list,new MyComparator());
        return list;
    }
}
