package com.zhuifeng.shipping.web;

import com.zhuifeng.shipping.pojo.UserPojo;
import com.zhuifeng.shipping.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    IUserService userService;

    private  String  login(UserPojo userPojo, HttpSession session, Model model){
        UserPojo user = userService.login(userPojo);
        if (null == user){
            model.addAttribute("Error","账号或者密码不对");
            return "login";
        }
        session.setAttribute("user",user);
        return "index";

    }


}
