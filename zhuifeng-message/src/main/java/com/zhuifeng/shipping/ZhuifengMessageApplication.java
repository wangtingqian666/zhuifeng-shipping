package com.zhuifeng.shipping;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo //暴露服务
public class ZhuifengMessageApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZhuifengMessageApplication.class, args);
    }

}
