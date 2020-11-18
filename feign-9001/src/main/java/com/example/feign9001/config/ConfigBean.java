package com.example.feign9001.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: xudengping
 */
@Configuration
public class ConfigBean {
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
