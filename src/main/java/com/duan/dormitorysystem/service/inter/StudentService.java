package com.duan.dormitorysystem.service.inter;

import com.duan.dormitorysystem.bean.Student;

public interface StudentService {

    /**
     * 登录检查
     * @param admin 学生的学号
     * @return 密码
     */
    Student adminCheck(String admin);
}
