package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author LIXUBO
 * @Date: 2022-07-05  18:15
 * @description: Eureka启动类
 * @version: 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
//@EnableEurekaServer 说明自己是eureka注册中心
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
