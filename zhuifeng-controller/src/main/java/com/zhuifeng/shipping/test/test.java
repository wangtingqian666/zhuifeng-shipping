package com.zhuifeng.shipping.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test {

    //跳转至首页
    @GetMapping("index")
    public String index(){
        return "index";
    }
    //跳转至航线
    @GetMapping("itinerary")
    public String itinerary(){
        return "itinerary";
    }
    //跳转至帮助中心
    @GetMapping("helpin")
    public String helpin(){
        return "helpin";
    }
    //跳转至信息订阅与查询
    @GetMapping("querysub")
    public String querysub(){
        return "querysub";
    }
}