package com.zhuifeng.shipping.web;

import com.zhuifeng.shipping.pojo.UserPojo;
import com.zhuifeng.shipping.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    /**
     * 登录
     * @param userPojo
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("login")
    private  String  login(UserPojo userPojo, HttpSession session, Model model){
        UserPojo user = userService.login(userPojo);
        if (null == user ){
            model.addAttribute("message","账号或者密码不对");
            return "login.html";
        }
        session.setAttribute("user",user);
        return "index.html";
    }

    /**
     * 验证注册
     * @param userPojo
     * @param model
     * @return
     */
    @RequestMapping("userRegister")
    public  String userRegister(UserPojo userPojo,Model model){

        if (userPojo.getUname() == null || userPojo.getUname() ==""){
            model.addAttribute("message","用户名不能为空");
            return "Register.html";
        }
        if(userPojo.getUpass()==null ||userPojo.getUpass() ==""||userPojo.getRepass()==null || userPojo.getRepass()==""){
            model.addAttribute("message","密码不能为空");
            return "Register.html";
        }
        if (!userPojo.getRepass().equals(userPojo.getUpass())){
            model.addAttribute("message","两次密码不对");
            return "Register.html";
        }
        UserPojo userPojo1 = userService.login(userPojo);
        if (userPojo1 != null){
            model.addAttribute("message","账号已存在");
            return "Register.html";
        }
        userService.userRegister(userPojo);
        return "login.html";
    }
}
