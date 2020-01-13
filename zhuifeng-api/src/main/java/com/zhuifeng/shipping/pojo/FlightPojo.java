package com.zhuifeng.shipping.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "s_flight")
public class FlightPojo implements Serializable {//航班表
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fid;//主键 自增
    private String fschedule;//班期
    private String forigin;//起始地点
    private String farrival;//到达地点
    private Date fstime;//始发时间
    private int fvoyage;//中间航行时间
    private double fprice;//运价
    private int fstatus;//状态

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFschedule() {
        return fschedule;
    }

    public void setFschedule(String fschedule) {
        this.fschedule = fschedule;
    }

    public String getForigin() {
        return forigin;
    }

    public void setForigin(String forigin) {
        this.forigin = forigin;
    }

    public String getFarrival() {
        return farrival;
    }

    public void setFarrival(String farrival) {
        this.farrival = farrival;
    }

    public Date getFstime() {
        return fstime;
    }

    public void setFstime(Date fstime) {
        this.fstime = fstime;
    }

    public int getFvoyage() {
        return fvoyage;
    }

    public void setFvoyage(int fvoyage) {
        this.fvoyage = fvoyage;
    }

    public double getFprice() {
        return fprice;
    }

    public void setFprice(double fprice) {
        this.fprice = fprice;
    }

    public int getFstatus() {
        return fstatus;
    }

    public void setFstatus(int fstatus) {
        this.fstatus = fstatus;
    }
}
