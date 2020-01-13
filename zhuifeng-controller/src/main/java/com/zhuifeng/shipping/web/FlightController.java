package com.zhuifeng.shipping.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhuifeng.shipping.pojo.FlightPojo;
import com.zhuifeng.shipping.service.IFlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FlightController {
    @Reference(check = false)
    IFlightService flightService;

    /***
     *查询未出发车的航班
     * @return
     */
    @RequestMapping("index")
    public String queryFlight(Model model){
        List<FlightPojo> flightPojos = flightService.queryFlight(0);
        model.addAttribute("flights",flightPojos);
        return "index";
    }
}
