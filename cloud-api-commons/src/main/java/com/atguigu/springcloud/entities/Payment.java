package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author LIXUBO
 * @Date: 2022-07-04  17:32
 * @description: 支付类
 * @version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment  implements Serializable {
    //  implements Serializable 序列化
    private Long id;
    private String serial;
}
