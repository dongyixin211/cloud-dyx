package com.rule;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyNacosRule {

    @Bean(value = "myRule")
    public IRule myRule(){

//        return new BestAvailableRule(); // 选择最小并发请求的server
//        return new AvailabilityFilteringRule(); // 可用性筛选规则：去掉不健康，请求达到阈值的，然后再对剩下的服务进行轮询
//    return new WeightedResponseTimeRule(); // 权重加相应时间： 根据平均响应时间计算权重。统计的信息如果不足以计算的话就按照轮询的规则
    return new RetryRule(); // 重试规则 ：按照轮询，如果服务出现故障，先尝试轮询等待服务相应，如果多次未响应就尝试其他服务；
//    return new RoundRobinRule(); // 轮询规则；
//    return new RandomRule();  // 随机；
//    return new ZoneAvoidanceRule(); // 分区无效规则 ；

    }
}
