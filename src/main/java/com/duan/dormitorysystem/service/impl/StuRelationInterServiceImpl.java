package com.duan.dormitorysystem.service.impl;

import com.duan.dormitorysystem.bean.StuRelationInter;
import com.duan.dormitorysystem.bean.StuRelationInterExample;
import com.duan.dormitorysystem.dao.StuRelationInterMapper;
import com.duan.dormitorysystem.service.inter.StuRelationInterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Duan
 * @date 2018/8/8 16:08
 */

@Service
public class StuRelationInterServiceImpl implements StuRelationInterService{

    @Autowired
    StuRelationInterMapper stuRelationInterMapper;

    /**
     * 添加
     * @param stuRelationInter 对象
     */
    public void add(StuRelationInter stuRelationInter) {
        stuRelationInterMapper.insertSelective(stuRelationInter);
    }

    /**
     * 检查对应学生是否有对应的兴趣
     * @param stuId 学生id
     * @return 存在布尔
     */
    public boolean check(long stuId) {
        StuRelationInterExample example=new StuRelationInterExample();
        StuRelationInterExample.Criteria criteria=example.createCriteria();
        criteria.andStuIdEqualTo(stuId);
        List<StuRelationInter> list=stuRelationInterMapper.selectByExample(example);
        if (list.isEmpty()){
            return false;
        }else {
            return true;
        }
    }
}
