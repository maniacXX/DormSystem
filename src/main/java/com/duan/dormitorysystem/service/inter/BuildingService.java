package com.duan.dormitorysystem.service.inter;

import com.duan.dormitorysystem.bean.Building;
import com.duan.dormitorysystem.bean.Msg;

import java.util.List;

public interface BuildingService {
    /**
     * 通过寝室的id号获得寝室信息
     * @param id 寝室id号
     * @return 寝室对象
     */
    Building getDormById(long id);

    /**
     * 查到所有寝室信息
     * @return
     */
    public List<Building> getAll();

    /**
     * 通过楼栋号与寝室号查找寝室信息
     * @param buildingNum 楼栋号
     * @param dormNum 寝室号
     * @return 寝室对象
     */
    public Building getDormByinfo(String buildingNum, String dormNum);

    /**
     * 寝室床位状态置零
     * @param building 寝室对象
     */
    void cancel(Building building);

    /**
     * 寝室床位状态置一
     * @param building 寝室对象
     */
    void pick(Building building);

    /**
     * 检查新添加的房间是不是重复了
     * @param buildingNumber 楼栋号
     * @param dormNumber 房间号
     * @return 布尔值
     */
    boolean checkRepeat(String buildingNumber, String dormNumber);

    /**
     * 新添加一个房间
     * @param building 要添加的房间
     */
    void add(Building building);

    /**
     * 修改房间信息
     * @param building 房间信息
     */
    public void update(Building building);

    /**
     * 删除房间
     * @param id 房间id
     */
    void deleteById(long id);

}
