package com.dyx;

import com.rule.MyNacosRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClient(name = "cloud-goods",configuration = {MyNacosRule.class})
@EnableFeignClients (basePackages = "com.dyx")// 开启feign
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate initRestTemplate(){

        return new RestTemplate();
    }
}
