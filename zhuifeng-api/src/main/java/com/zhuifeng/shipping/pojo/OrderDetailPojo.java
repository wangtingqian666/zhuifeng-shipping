package com.zhuifeng.shipping.pojo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "s_order_detail")
public class OrderDetailPojo implements Serializable {//订单详细表
    @Id
    private String odid;//主键
    private int odnumber;//船 次
    private String odshipname;//船号
    private String odcanum;//箱号
    private String odbox;//箱型
    private String odsize;//尺寸
    private double odempty;//空重
    private String oddynamic;//箱动态
    private Date oddytime;//箱子动态时间
    private String odremark;//备注
    private FlightPojo flightPojo;//和船关系 多对一
    private String oid;//提单号 订单外键

    private int pageNum;//当前页
    private int pageSize;//偏移量


    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public FlightPojo getFlightPojo() {
        return flightPojo;
    }

    public void setFlightPojo(FlightPojo flightPojo) {
        this.flightPojo = flightPojo;
    }

    public String getOdid() {
        return odid;
    }

    public void setOdid(String odid) {
        this.odid = odid;
    }

    public int getOdnumber() {
        return odnumber;
    }

    public void setOdnumber(int odnumber) {
        this.odnumber = odnumber;
    }

    public String getOdshipname() {
        return odshipname;
    }

    public void setOdshipname(String odshipname) {
        this.odshipname = odshipname;
    }

    public String getOdcanum() {
        return odcanum;
    }

    public void setOdcanum(String odcanum) {
        this.odcanum = odcanum;
    }

    public String getOdbox() {
        return odbox;
    }

    public void setOdbox(String odbox) {
        this.odbox = odbox;
    }

    public String getOdsize() {
        return odsize;
    }

    public void setOdsize(String odsize) {
        this.odsize = odsize;
    }

    public double getOdempty() {
        return odempty;
    }

    public void setOdempty(double odempty) {
        this.odempty = odempty;
    }

    public String getOddynamic() {
        return oddynamic;
    }

    public void setOddynamic(String oddynamic) {
        this.oddynamic = oddynamic;
    }

    public Date getOddytime() {
        return oddytime;
    }

    public void setOddytime(Date oddytime) {
        this.oddytime = oddytime;
    }

    public String getOdremark() {
        return odremark;
    }

    public void setOdremark(String odremark) {
        this.odremark = odremark;
    }
}
