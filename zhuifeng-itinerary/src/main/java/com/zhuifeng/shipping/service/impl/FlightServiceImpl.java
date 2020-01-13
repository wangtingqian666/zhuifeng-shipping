package com.zhuifeng.shipping.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhuifeng.shipping.mapper.FlightMapper;
import com.zhuifeng.shipping.pojo.FlightPojo;
import com.zhuifeng.shipping.service.IFlightService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
@org.springframework.stereotype.Service
public class FlightServiceImpl implements IFlightService {

    @Autowired
    FlightMapper flightMapper;

    @Override
    public List<FlightPojo> queryFlight(int fstatus) {
        return flightMapper.findFlightPojoByFstatus(fstatus);
    }
}
