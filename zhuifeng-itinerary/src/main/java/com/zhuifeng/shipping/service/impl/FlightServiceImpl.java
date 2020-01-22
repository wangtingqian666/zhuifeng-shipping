package com.zhuifeng.shipping.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhuifeng.shipping.mapper.FlightMapper;
import com.zhuifeng.shipping.pojo.FlightPojo;
import com.zhuifeng.shipping.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
@Service
@org.springframework.stereotype.Service
public class FlightServiceImpl implements IFlightService {

    @Autowired
    FlightMapper flightMapper;


    /**
     * 查询所有未起航的船
     * @param fstatus
     * @return
     */
    @Override
    public List<FlightPojo> queryFlight(int fstatus) {
        return flightMapper.findFlightPojoByFstatus(fstatus);
    }

    /**
     * 根据航线查询航班
     * @param fschedule
     * @param fstatus
     * @return
     */
    @Override
    public List<FlightPojo> clickFschedule(String fschedule, int fstatus) {
        return null;
    }

    /**
     /**
     * 查询所有的船
     * @return
     */

    @Override
    public List<FlightPojo> queryFid(int fstatus) {
        return flightMapper.findFlightPojoByFstatus(fstatus);
    }

}
