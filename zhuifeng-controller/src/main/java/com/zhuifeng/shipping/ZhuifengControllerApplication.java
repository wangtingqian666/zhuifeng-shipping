package com.zhuifeng.shipping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ZhuifengControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhuifengControllerApplication.class, args);
    }

}
