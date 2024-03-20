package com.config;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
@Component
public class MyGateWayRoutePredicateFactory  extends AbstractRoutePredicateFactory<MyConfig> {


    public MyGateWayRoutePredicateFactory(Class<MyConfig> configClass) {
        super(configClass);
    }

    @Override
    public Predicate<ServerWebExchange> apply(MyConfig config) {

        return new Predicate<ServerWebExchange>() {
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
               if (!StringUtils.isEmpty(serverWebExchange.getRequest().getHeaders().getFirst(config.getKey())) ){
                  return true;
               }
                return false;
            }
        };
    }

    @Override
    public List<String> shortcutFieldOrder() {
//        return super.shortcutFieldOrder();
        return Arrays.asList("key","value");
    }
}
