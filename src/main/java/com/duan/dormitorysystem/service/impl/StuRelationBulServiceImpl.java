package com.duan.dormitorysystem.service.impl;

import com.duan.dormitorysystem.bean.StuRelationBul;
import com.duan.dormitorysystem.bean.StuRelationBulExample;
import com.duan.dormitorysystem.dao.StuRelationBulMapper;
import com.duan.dormitorysystem.service.inter.StuRelationBulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
