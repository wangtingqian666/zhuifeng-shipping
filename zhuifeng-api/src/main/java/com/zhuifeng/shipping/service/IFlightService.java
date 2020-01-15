package com.zhuifeng.shipping.service;

import com.zhuifeng.shipping.pojo.FlightPojo;

import java.util.List;

public interface IFlightService {
    //查询未触发的船泊
    public List<FlightPojo> queryFlight(int fstatus);

    //点击查询未出发的船
    public List<FlightPojo> clickFschedule(String fschedule,int fstatus);


    //查询所有的船
    public List<FlightPojo> queryFid();

    //查询所有的航线
    public List<FlightPojo>  queryFschedule(String fschedule);

    //查询所有的起始地
    public List<FlightPojo> queryForigin(String forigin);

    //查询所有的目的地
    public List<FlightPojo> queryFarrival(String farrival);

    //查询所有的时间
    public List<FlightPojo> queryFstime(String fstime);

}