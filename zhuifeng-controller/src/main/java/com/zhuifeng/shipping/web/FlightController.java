package com.zhuifeng.shipping.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhuifeng.shipping.pojo.FlightPojo;
import com.zhuifeng.shipping.service.IFlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

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

    /**
     * 查询所有的船
     *
     * @param model
     * @return
     */
    @RequestMapping("itinerary")
    public String queryFid(Model model) {
        List<FlightPojo> list = flightService.queryFid(0);
        Set<String> set = new HashSet<>();
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        Set<Date> set3 = new HashSet<>();
        //遍历
        Iterator<FlightPojo> iterator = list.iterator();
        while (iterator.hasNext()) {
            FlightPojo flight = iterator.next();
            //获取进行去重
            String fschedule = flight.getFschedule();
            String forigin = flight.getForigin();
            String farrival = flight.getFarrival();
            Date fstime = flight.getFstime();
            set.add(fschedule);
            set1.add(forigin);
            set2.add(farrival);
            set3.add(fstime);
        }


        model.addAttribute("fschedule", set);
        model.addAttribute("forigin", set1);
        model.addAttribute("farrival", set2);
        model.addAttribute("fstime", set3);
        return "itinerary";
    }

}
