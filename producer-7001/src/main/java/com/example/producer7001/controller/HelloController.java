package com.example.producer7001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: xudengping
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    String port;


    @GetMapping("/hello")
    public String hello() {
        return "hello,world" + port;
    }
}
