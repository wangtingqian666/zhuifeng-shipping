package com.zhuifeng.shipping.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "s_order")
public class OrderPojo implements Serializable {
    @Id
    private String oid;
    private int ocasenum;
    private double oprice;
    private int user_id;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public int getOcasenum() {
        return ocasenum;
    }

    public void setOcasenum(int ocasenum) {
        this.ocasenum = ocasenum;
    }

    public double getOprice() {
        return oprice;
    }

    public void setOprice(double oprice) {
        this.oprice = oprice;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
}
