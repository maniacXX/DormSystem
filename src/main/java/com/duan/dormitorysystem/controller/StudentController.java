package com.duan.dormitorysystem.controller;


import com.duan.dormitorysystem.bean.Msg;
import com.duan.dormitorysystem.bean.Student;
import com.duan.dormitorysystem.service.inter.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Duan
 * @date 2018/6/28 13:31
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

    /**
     * 获取当前页的学生信息
     * @param pn 页码
     * @return 当前页所有学生信息
     */
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public Msg getAll(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
        //引入分页插件并调用,传入页码和每页的数据个数
        PageHelper.startPage(pn, 8);

        List<Student> students = studentService.getAll();

        PageInfo<Student> page = new PageInfo<Student>(students, 5);

        return Msg.success().add("pageInfo", page);
    }

    /**
     * 通过学生id得到学生信息
     * @param id 学生id
     * @return 学生信息
     */
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getInfoById(@PathVariable("id") long id){
        return Msg.success().add("stu",studentService.getInfoById(id));
    }

    /**
     * 通过学生id删除学生信息
     * @param id 学生id
     * @return 状态
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteById(@PathVariable("id") long id){
        studentService.delete(id);

        return Msg.success();
    }
}