package com.zhuifeng.shipping.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shipping")
public class UserPojo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;
    private  String uname;//名字
    private  String  upass;//密码
    private  String  uphone;//移动电话
    private  String  uemail;//电子邮箱
    private  String  uwechar;// 微信
    private  String  uqq;// qq
    private  String  utelephone;//固定电话
    private  String  ucompany;//公司
    private  String  upostalcode;//邮政编码

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }
     //写点什么
    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUwechar() {
        return uwechar;
    }

    public void setUwechar(String uwechar) {
        this.uwechar = uwechar;
    }

    public String getUqq() {
        return uqq;
    }

    public void setUqq(String uqq) {
        this.uqq = uqq;
    }

    public String getUtelephone() {
        return utelephone;
    }

    public void setUtelephone(String utelephone) {
        this.utelephone = utelephone;
    }

    public String getUcompany() {
        return ucompany;
    }

    public void setUcompany(String ucompany) {
        this.ucompany = ucompany;
    }

    public String getUpostalcode() {
        return upostalcode;
    }

    public void setUpostalcode(String upostalcode) {
        this.upostalcode = upostalcode;
    }
}
