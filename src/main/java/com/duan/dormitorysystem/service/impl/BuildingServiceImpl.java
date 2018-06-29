package com.duan.dormitorysystem.service.impl;

import com.duan.dormitorysystem.bean.Building;
import com.duan.dormitorysystem.bean.BuildingExample;
import com.duan.dormitorysystem.dao.BuildingMapper;
import com.duan.dormitorysystem.service.inter.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @date 2018/6/28 13:32
 */

@Service
public class BuildingServiceImpl implements BuildingService{

    @Autowired
    private BuildingMapper buildingMapper;

    /**
     * 通过寝室id返回寝室信息
     * @param id 寝室id号
     * @return 寝室信息
     */
    public Building getDormById(long id) {
        return buildingMapper.selectByPrimaryKey(id);
    }

    /**
     * 得到所有寝室信息
     * @return
     */
    public List<Building> getAll() {
        return buildingMapper.selectByExample(null);
    }

    /**
     * 通过楼栋号与寝室号查找寝室信息
     * @param buildingNum 楼栋号
     * @param dormNum 寝室号
     * @return 寝室对象
     */
    public Building getDormByinfo(String buildingNum, String dormNum) {
        BuildingExample buildingExample=new BuildingExample();
        BuildingExample.Criteria criteria=buildingExample.createCriteria();
        criteria.andBuildingNumberEqualTo(buildingNum);
        criteria.andDormNumberEqualTo(dormNum);
        return buildingMapper.selectByExample(buildingExample).get(0);
    }
}
