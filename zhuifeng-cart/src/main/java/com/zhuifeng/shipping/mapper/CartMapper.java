package com.zhuifeng.shipping.mapper;

import com.zhuifeng.shipping.pojo.OrderDetailPojo;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface CartMapper extends Mapper<CartMapper> {
    /***
     * 根据用户id查询详细信息
     */
    public List<OrderDetailPojo> querydetail(OrderDetailPojo orderDetailPojo);
}
