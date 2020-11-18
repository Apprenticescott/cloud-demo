package com.example.ribbon9002.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: xudengping
 */
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    public final static String PRE = "http://PRODUCER";

    @HystrixCommand(fallbackMethod = "error")
    @GetMapping("/hello")
    public String hello() {
        return restTemplate.getForObject(PRE + "/hello", String.class);
    }

    public String error() {
        return "该服务暂停使用";
    }
}
