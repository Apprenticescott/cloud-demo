package com.example.producer7000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Producer7000Application {

    public static void main(String[] args) {
        SpringApplication.run(Producer7000Application.class, args);
    }

}
