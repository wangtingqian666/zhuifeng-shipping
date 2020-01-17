package com.zhuifeng.shipping;

import com.zhuifeng.shipping.pojo.OrderDetailPojo;
import com.zhuifeng.shipping.pojo.OrderPojo;
import com.zhuifeng.shipping.service.ICartService;
import com.zhuifeng.shipping.utils.UuidUtils;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@MapperScan("com.zhuifeng.shipping.mapper")
class ZhuifengCartApplicationTests {

    @Autowired
    ICartService cartService;

    @Test
    void contextLoads() {
        String uUid = UuidUtils.getUUid();
        System.out.println(uUid);
    }

    /***
     * 分页测试
     */
    @Test
    public void test1() {
        OrderPojo orderPojo =new OrderPojo();
        orderPojo.setUser_id(1);
        OrderDetailPojo orderDetailPojo=new OrderDetailPojo();
        orderDetailPojo.setOrderPojo(orderPojo);
//        List<OrderDetailPojo> querydetail = cartService.querydetail(orderDetailPojo);
//        System.out.println(querydetail);
    }
}