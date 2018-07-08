package com.duan.dormitorysystem.controller;

import com.duan.dormitorysystem.bean.Msg;
import com.duan.dormitorysystem.bean.Student;
import com.duan.dormitorysystem.service.inter.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Duan
 * @date 2018/6/28 13:30
 */

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 登录检测
     * @param message 学号-密码
     * @return 密码
     */
    @RequestMapping(value = "/check/{message}",method = RequestMethod.POST)
    @ResponseBody
    public Msg loginCheck(@PathVariable("message") String message, HttpSession session){
        String[] info=message.split("-");
        Student student=studentService.adminCheck(info[0]);
        if (student!=null){
            if(student.getStuPassword().equals(info[1])) {
                session.setAttribute("user", student);
                return Msg.success();
            }else {
                return Msg.fail().add("reason",1);
            }
        }else{
            return Msg.fail().add("reason",0);
        }
    }

    /**
     * 登录验证状态,并返回信息
     * @param session
     * @return 学生信息
     */
    @ResponseBody
    @RequestMapping(value = "/userInfo",method = RequestMethod.GET)
    public Msg loginStatusCheck(HttpSession session) {
        if (session.getAttribute("user")==null){
            return Msg.fail();
        }else {
            return Msg.success().add("student",session.getAttribute("user"));
        }
    }

    /**
     * 通过学生id得到学生信息
     * @param stuIds 学生id串
     * @return 学生信息
     */
    @RequestMapping(value = "/gets/{stuIds}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getInfoByIds(@PathVariable("stuIds") String stuIds){
        String[] stuId=stuIds.split("-");
        List<Student> students=new ArrayList<Student>();
        for(int i=0;i<stuId.length;i++){
           students.add(studentService.getInfoById(Long.parseLong(stuId[i])));
        }
        Student[] students1=new Student[students.size()];
        students.toArray(students1);
        return Msg.success().add("students",students1);
    }
}