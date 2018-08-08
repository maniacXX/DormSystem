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
        List<Building> list= buildingMapper.selectByExample(buildingExample);
        if (list.isEmpty()){
            return null;
        }else {
            return list.get(0);
        }
    }

    /**
     * 寝室床位状态置零
     * @param building 寝室对象
     */
    public void cancel(Building building) {
        int currentNum=buildingMapper.selectByPrimaryKey(building.getDormId()).getDormCurrentPeople();
        building.setDormCurrentPeople((byte)(currentNum-1));
        buildingMapper.updateByPrimaryKeySelective(building);
    }

    /**
     * 寝室床位状态置零
     * @param building 寝室对象
     */
    public void pick(Building building) {
        int currentNum=buildingMapper.selectByPrimaryKey(building.getDormId()).getDormCurrentPeople();
        building.setDormCurrentPeople((byte)(currentNum+1));
        buildingMapper.updateByPrimaryKeySelective(building);
    }

    /**
     * 检查房间是否重复
     * @param buildingNumber 楼栋号
     * @param dormNumber 房间号
     * @return 布尔
     */
    public boolean checkRepeat(String buildingNumber, String dormNumber) {
        BuildingExample example=new BuildingExample();
        BuildingExample.Criteria criteria=example.createCriteria();
        criteria.andBuildingNumberEqualTo(buildingNumber);
        criteria.andDormNumberEqualTo(dormNumber);

        List<Building> buildings=buildingMapper.selectByExample(example);

        return !(buildings.isEmpty());
    }

    /**
     * 新添加一个房间
     * @param building 要添加的房间
     */
    public void add(Building building) {
       buildingMapper.insertSelective(building);
    }

    /**
     * 修改房间信息
     * @param building 房间信息
     */
    public void update(Building building) {
        buildingMapper.updateByPrimaryKeySelective(building);
    }

    /**
     * 删除房间
     * @param id 房间id
     */
    public void deleteById(long id) {
        buildingMapper.deleteByPrimaryKey(id);
    }

}
