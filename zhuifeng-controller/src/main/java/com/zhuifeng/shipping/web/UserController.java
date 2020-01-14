package com.zhuifeng.shipping.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhuifeng.shipping.pojo.UserPojo;
import com.zhuifeng.shipping.service.IUserService;
import com.zhuifeng.shipping.utils.StringNull;
import com.zhuifeng.shipping.utils.UserResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Reference
    IUserService userService;

    /***
     * 登陆 ajax返回
     * @param userPojo
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("login")
    private String login(UserPojo userPojo, HttpSession session, Model model){
        UserResponse msg=new UserResponse();
        boolean flg=true;
        if (!StringNull.isEmpty(userPojo.getUname())){
            model.addAttribute("error","用户名不能为空");
            flg=false;
    }
        if (!StringNull.isEmpty(userPojo.getUpass())){
            model.addAttribute("error","密码不能为空");
            flg=false;
        }
        if (flg){
        UserPojo user = userService.login(userPojo);
        if (null == user){
            model.addAttribute("error","对不起,账号或者密码不正确,请重新输入");
            return "login";
          }else{
            msg.setCode("111");
            msg.setMessage("恭喜您,登陆成功");
            session.setAttribute("user",user);
            return "index";
          }
        }
        return "login";
    }
    /**
     * 验证注册
     * @param userPojo
     * @param model
     * @return
     */
    @RequestMapping("register")
    public  String userRegister(UserPojo userPojo,Model model){

        if (userPojo.getUname() == null || userPojo.getUname() ==""){
            model.addAttribute("error","用户名不能为空");
            return "register";
        }
        if(userPojo.getUpass()==null ||userPojo.getUpass() ==""||userPojo.getRepass()==null || userPojo.getRepass()==""){
            model.addAttribute("error","密码不能为空");
            return "register";
        }
        if (!userPojo.getRepass().equals(userPojo.getUpass())){
            model.addAttribute("error","两次密码不对");
            return "register";
        }
        UserPojo userPojo1 = userService.login(userPojo);
        if (userPojo1 != null){
            model.addAttribute("error","账号已存在");
            return "register";
        }
        userService.userRegister(userPojo);
        return "login";
    }
}