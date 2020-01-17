package com.zhuifeng.shipping.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhuifeng.shipping.mapper.CartMapper;
import com.zhuifeng.shipping.pojo.OrderDetailPojo;
import com.zhuifeng.shipping.pojo.OrderPojo;
import com.zhuifeng.shipping.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@com.alibaba.dubbo.config.annotation.Service
public class CartServiceImpl implements ICartService {
    @Autowired
    CartMapper cartMapper;

    @Override
    public PageInfo<OrderDetailPojo> querydetail(OrderDetailPojo orderDetailPojo) {
        PageHelper.startPage(orderDetailPojo.getPageNum(),orderDetailPojo.getPageSize());
        //获取到信息
        List<OrderDetailPojo> list= cartMapper.querydetail(orderDetailPojo);
        //不能执行
        PageInfo<OrderDetailPojo> pageInfo=new PageInfo<>(list);
        return  pageInfo;
    }
}
