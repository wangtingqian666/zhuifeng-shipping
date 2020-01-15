package com.zhuifeng.shipping.mapper;

import com.zhuifeng.shipping.pojo.FlightPojo;
import tk.mybatis.mapper.common.Mapper;

import java.util.Date;
import java.util.List;

public interface FlightMapper extends Mapper<FlightPojo> {
    //查询未启航的船
    public List<FlightPojo> findFlightPojoByFstatus(int fstatus);
    //根据起始地条件查询航班
    public List<FlightPojo> findFlightPojoByForiginAndFstatus(String forigin,int fstatus);
    //根据到达地点查询航班
    public List<FlightPojo> findFlightPojoByFarrivalAndFstatus(String farrival,int fstatus);
    //根据出发时间查询
    public List<FlightPojo> findFlightPojoByFstimeAndFstatus(Date fstime, int fstatus);
}
