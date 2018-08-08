package com.duan.dormitorysystem.service.inter;

import com.duan.dormitorysystem.bean.Student;

import java.util.List;

public interface StudentService {

    /**
     * 登录检查
     * @param admin 学生的学号
     * @return 学生对象
     */
    Student adminCheck(String admin);

    /**
     * 通过学生id得到学生信息
     * @param stuId 学生id
     * @return 学生信息
     */
    Student getInfoById(Long stuId);

    /**
     * 获得所有学生信息
     * @return 所有学生信息
     */
    List<Student> getAll();

    /**
     * 删除学生信息
     * @param id 学生id
     */
    void delete(long id);
}
