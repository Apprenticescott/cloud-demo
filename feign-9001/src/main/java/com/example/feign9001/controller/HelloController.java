package com.example.feign9001.controller;

import com.example.feign9001.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: xudengping
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @Value("${spring.version}")
    String version;

    @GetMapping("/hello")
    public String hello() {
        return helloService.Hello() + version;
    }
}
