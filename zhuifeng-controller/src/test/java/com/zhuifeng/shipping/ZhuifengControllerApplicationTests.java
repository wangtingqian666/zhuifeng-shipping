package com.zhuifeng.shipping;

import com.zhuifeng.shipping.service.IFlightService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZhuifengControllerApplicationTests {

    @Autowired
    IFlightService flightService;

    @Test
    void contextLoads() {
    }
}
