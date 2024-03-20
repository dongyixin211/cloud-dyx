package com.dyx;

import com.config.MyConfig;
import com.config.MyGateWayRoutePredicateFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient // nacos服务注册
public class Gateway {


    public static void main(String[] args) {
        SpringApplication.run(Gateway.class);
    }

    @Bean
    public MyGateWayRoutePredicateFactory cretaMyGateWayRoutePredicateFactory(){
        return new MyGateWayRoutePredicateFactory(MyConfig.class);
    }
}
