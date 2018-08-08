package com.duan.dormitorysystem.controller;

import com.duan.dormitorysystem.bean.Manager;
import com.duan.dormitorysystem.bean.Msg;
import com.duan.dormitorysystem.service.inter.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author Duan
 * @date 2018/8/5 11:51
 */

@Controller
@RequestMapping("/mana")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    /**
     * 登录检测
     * @param message 账号-密码
     * @return 密码
     */
    @RequestMapping(value = "/check/{message}",method = RequestMethod.POST)
    @ResponseBody
    public Msg loginCheck(@PathVariable("message") String message, HttpSession session){
        String[] info=message.split("-");
        Manager manager=managerService.adminCheck(info[0]);
        if (manager!=null){
            if(manager.getManaPassword().equals(info[1])) {
                session.setAttribute("mana", manager);
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
     * @return 管理员信息
     */
    @ResponseBody
    @RequestMapping(value = "/manaInfo",method = RequestMethod.GET)
    public Msg loginStatusCheck(HttpSession session) {
        if (session.getAttribute("mana")==null){
            return Msg.fail();
        }else {
            return Msg.success().add("mana",session.getAttribute("mana"));
        }
    }
}
