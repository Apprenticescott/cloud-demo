package com.example.feign9001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.feign9001")
public class Feign9001Application {

    public static void main(String[] args) {
        SpringApplication.run(Feign9001Application.class, args);
    }

}
