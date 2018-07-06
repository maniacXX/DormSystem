package com.duan.dormitorysystem.service.inter;

import com.duan.dormitorysystem.bean.StuRelationBul;

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
}
