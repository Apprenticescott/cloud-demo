package com.example.feign9001.service;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: xudengping
 */
@Component
public class HelloServiceFallBack implements HelloService {

    public String Hello() {
        return "该服务暂停使用";
    }
}
