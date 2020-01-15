package com.zhuifeng.shipping;

import com.zhuifeng.shipping.pojo.OrderDetailPojo;
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

    @Test
    public void test1() {

        List<OrderDetailPojo> querydetail = cartService.querydetail(1);
        System.out.println(querydetail);
    }
}