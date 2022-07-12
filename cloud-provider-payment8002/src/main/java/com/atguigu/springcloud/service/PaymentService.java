package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author LIXUBO
 * @Date: 2022-07-04  18:11
 * @description: service
 * @version: 1.0.0
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
