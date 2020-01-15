package com.zhuifeng.shipping.service;

import com.zhuifeng.shipping.pojo.OrderDetailPojo;

import java.util.List;

public interface ICartService {
    /***
     * 根据用户id查询详细信息
     */
    public List<OrderDetailPojo> querydetail(int uid);
}
