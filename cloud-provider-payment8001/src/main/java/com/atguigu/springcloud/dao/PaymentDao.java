package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author LIXUBO
 * @Date: 2022-07-04  17:44
 * @description: dao
 * @version: 1.0.0
 */
@Mapper
public interface PaymentDao {
    //读写操作
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
    //增删改查
}
