package com.example.ribbon9002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(value = "PRODUCER")
@EnableHystrix
public class Ribbon9002Application {

    public static void main(String[] args) {
        SpringApplication.run(Ribbon9002Application.class, args);
    }

}
