package com.zhuifeng.shipping.service.impl;

import com.zhuifeng.shipping.mapper.CartMapper;
import com.zhuifeng.shipping.pojo.OrderDetailPojo;
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
    public List<OrderDetailPojo> querydetail(OrderDetailPojo orderDetailPojo) {

        return  cartMapper.querydetail(orderDetailPojo);
    }
}
