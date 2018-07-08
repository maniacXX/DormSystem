package com.duan.dormitorysystem.service.inter;

import com.duan.dormitorysystem.bean.Student;

public interface StudentService {

    /**
     * 登录检查
     * @param admin 学生的学号
     * @return 密码
     */
    Student adminCheck(String admin);

    /**
     * 通过学生id得到学生信息
     * @param stuId 学生id
     * @return 学生信息
     */
    Student getInfoById(Long stuId);
}
