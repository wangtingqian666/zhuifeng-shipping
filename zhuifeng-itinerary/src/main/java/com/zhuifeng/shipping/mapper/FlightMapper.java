package com.zhuifeng.shipping.mapper;

import com.zhuifeng.shipping.pojo.FlightPojo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightMapper extends JpaRepository<FlightPojo,Integer> {
    //查询未启航的船
    public List<FlightPojo> findFlightPojoByFstatus(int fstatus);
}
