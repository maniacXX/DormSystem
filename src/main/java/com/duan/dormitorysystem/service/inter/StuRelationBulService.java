package com.duan.dormitorysystem.service.inter;

import com.duan.dormitorysystem.bean.StuRelationBul;

import java.util.List;

public interface StuRelationBulService {
    /**
     * 通过学生id返回寝室学生关联信息
     * @param stuId
     * @return
     */
    public StuRelationBul getInfoByStuId(long stuId);

    /**
     * 删除关系
     */
    public void deleteById(long id);

    /**
     * 新增
     * @param stuRelationBul 新增的对象
     */
    void add(StuRelationBul stuRelationBul);

    /**
     * 通过寝室id获得学生与寝室的关联信息
     * @param dormId 寝室号
     * @return
     */
    List<StuRelationBul> getInfoByDormId(long dormId);

    /**
     * 获取所有关系信息
     * @return 所有关系信息
     */
    List<StuRelationBul> getAll();

    /**
     * 删除与房间相关的id
     * @param id 房间id
     */
    void deleteByDormId(long id);
}
