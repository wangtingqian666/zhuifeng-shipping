package com.zhuifeng.shipping.service;

import com.zhuifeng.shipping.pojo.FlightPojo;

import java.util.List;

public interface IFlightService {
    //查询未触发的船泊
    public List<FlightPojo> queryFlight(int fstatus);
}