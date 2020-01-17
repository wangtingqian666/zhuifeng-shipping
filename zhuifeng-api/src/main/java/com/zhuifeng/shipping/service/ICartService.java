package com.zhuifeng.shipping.service;

import com.github.pagehelper.PageInfo;
import com.zhuifeng.shipping.pojo.OrderDetailPojo;

import java.util.List;

public interface ICartService {
    /***
     * 根据用户id查询详细信息
     */
    public PageInfo<OrderDetailPojo> querydetail(OrderDetailPojo orderDetailPojo);
}
