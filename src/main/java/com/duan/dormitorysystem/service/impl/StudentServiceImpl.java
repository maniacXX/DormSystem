package com.duan.dormitorysystem.service.impl;

import com.duan.dormitorysystem.bean.Student;
import com.duan.dormitorysystem.bean.StudentExample;
import com.duan.dormitorysystem.dao.StudentMapper;
import com.duan.dormitorysystem.service.inter.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Administrator
 * @date 2018/6/28 13:34
 */

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 账号检查
     * @param admin 学生的学号
     * @return 学生对象
     */
    public Student adminCheck(String admin) {
        StudentExample studentExample=new StudentExample();
        StudentExample.Criteria criteria=studentExample.createCriteria();
        criteria.andStuCardIdEqualTo(admin);
        List<Student> students= studentMapper.selectByExample(studentExample);
        if (students.isEmpty()) {
            return null;
        }else {
            return students.get(0);
        }
    }

    /**
     * 通过学生id得到学生信息
     * @param stuId 学生id
     * @return 学生对象
     */
    public Student getInfoById(Long stuId) {
        return studentMapper.selectByPrimaryKey(stuId);
    }

    /**
     * 获取所有学生信息
     * @return 所有学生信息
     */
    public List<Student> getAll() {
        return studentMapper.selectByExample(null);
    }

    public void delete(long id) {
        studentMapper.deleteByPrimaryKey(id);
    }
}
