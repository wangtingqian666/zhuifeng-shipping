package com.zhuifeng.shipping.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "s_message")
public class MessagePojo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mid;//主键
    private String mname;//留言人
    private String mtitle;//主题
    private String mtype;//问题类型 1:咨询 2:建议 3:投诉
    private String mbody;//主题内容
    private String mphone;//电话号码
    private String memail;//电子邮件

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle;
    }

    public String getMtype() {
        return mtype;
    }

    public void setMtype(String mtype) {
        this.mtype = mtype;
    }

    public String getMbody() {
        return mbody;
    }

    public void setMbody(String mbody) {
        this.mbody = mbody;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getMemail() {
        return memail;
    }

    public void setMemail(String memail) {
        this.memail = memail;
    }
}
