package com.zhuifeng.shipping;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.zhuifeng.shipping.mapper")
public class ZhuifengItineraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhuifengItineraryApplication.class, args);
    }

}
