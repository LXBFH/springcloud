package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author LIXUBO
 * @Date: 2022-07-04  18:18
 * @description: 控制类
 * @version: 1.0.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("********插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功,端口："+serverPort, result);
        } else {
            return new CommonResult(404, "插入数据失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("********查询结果：" + payment);

        if (payment != null) {
            log.info("********查询成功" );
            return new CommonResult(200, "查询成功,端口："+serverPort, payment);

        } else {
            log.info("********查询成功" );
            return new CommonResult(404, "没有对应记录，查询失败" + id, null);
        }
    }
}
