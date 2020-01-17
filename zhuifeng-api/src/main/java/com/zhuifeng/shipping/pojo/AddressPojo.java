package com.zhuifeng.shipping.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "s_address")
public class AddressPojo implements Serializable {//收货地址
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;
    private String aconsigner;//发货人
    private String aceradd;//发货人地址
    private String aconsignee;//收货人
    private String aceeadd;//收货人地址
    private String anotifier;//通知人
    private String aneradd;//通知人地址
    private int user_id;//外键  用户外键

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAconsigner() {
        return aconsigner;
    }

    public void setAconsigner(String aconsigner) {
        this.aconsigner = aconsigner;
    }

    public String getAceradd() {
        return aceradd;
    }

    public void setAceradd(String aceradd) {
        this.aceradd = aceradd;
    }

    public String getAconsignee() {
        return aconsignee;
    }

    public void setAconsignee(String aconsignee) {
        this.aconsignee = aconsignee;
    }

    public String getAceeadd() {
        return aceeadd;
    }

    public void setAceeadd(String aceeadd) {
        this.aceeadd = aceeadd;
    }

    public String getAnotifier() {
        return anotifier;
    }

    public void setAnotifier(String anotifier) {
        this.anotifier = anotifier;
    }

    public String getAneradd() {
        return aneradd;
    }

    public void setAneradd(String aneradd) {
        this.aneradd = aneradd;
    }
}
