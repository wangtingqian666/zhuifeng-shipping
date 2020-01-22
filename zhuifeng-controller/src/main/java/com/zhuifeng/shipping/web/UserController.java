package com.zhuifeng.shipping.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhuifeng.shipping.pojo.AddressPojo;
import com.zhuifeng.shipping.pojo.UserPojo;
import com.zhuifeng.shipping.service.IUserService;
import com.zhuifeng.shipping.utils.StringNull;
import com.zhuifeng.shipping.utils.UserResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Reference(check = false)
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

    /***
     * 当用户点击会员中心的时候进去查询
     * 根据用户id查询 用户个人信息
     * @return
     */
    @RequestMapping("jumpuserinfo")
    public String userinfo(HttpSession session,Model model){
        UserPojo user = (UserPojo) session.getAttribute("user");
        if (null==user){//判断用户是否已经登陆
            return "login";
        }

        UserPojo userPojo = userService.selectUserByuid(user.getUid());
        model.addAttribute("userpojo",userPojo);
        return  "userinfo";
    }


    /***
     *根据用户id查询收货地址
     * @return
     */
    @GetMapping("receipt")
    public String query(HttpSession session,Model model){
        UserPojo user = (UserPojo) session.getAttribute("user");
        List<AddressPojo> address =userService.queryaddress(user.getUid());
        return "receipt";
    }

    /****
     * 根据用户id插入收货地址
     * @param addressPojo
     *
     * @return
     */
    @RequestMapping("insertadd")
    public String insertAdd(AddressPojo addressPojo){
        boolean flg = userService.insertAddByuid(addressPojo);
        return "forward:receipt";
    }
}