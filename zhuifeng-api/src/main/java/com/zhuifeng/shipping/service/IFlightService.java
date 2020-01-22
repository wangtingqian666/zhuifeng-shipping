package com.zhuifeng.shipping.service;

import com.zhuifeng.shipping.pojo.FlightPojo;

import java.util.List;

public interface IFlightService {
    //查询未触发的船泊
    public List<FlightPojo> queryFlight(int fstatus);

    //点击查询未出发的船
    public List<FlightPojo> clickFschedule(String fschedule,int fstatus);


    //查询所有的船
    public List<FlightPojo> queryFid(int i);



}