package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author LIXUBO
 * @Date: 2022-07-04  17:39
 * @description: 封装CommonResult
 * @version: 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code,String message)
    {
        this(code,message,null);
    }
}
