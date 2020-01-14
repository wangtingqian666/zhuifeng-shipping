package com.zhuifeng.shipping.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class JumpController {
    /***
     * 跳转到login登陆页
     * @return
     * @throws ServletException
     * @throws IOException
     */
    @GetMapping("jumplogin")
    public ModelAndView jumpIndex(){
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
    @GetMapping("jumpregister")
    public String jumpRegister(){
        return "register";
    }
}