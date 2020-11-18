package com.example.feign9001.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "PRODUCER", fallback = HelloServiceFallBack.class)
public interface HelloService {
    @GetMapping("/hello")
    String Hello();
}
