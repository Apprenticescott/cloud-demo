package com.example.eurekaclient7777;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClient7777Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClient7777Application.class, args);
    }

}
