package com.dyx.api;


import com.dyx.entry.JiFen;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("cloud-jifen")// 后跟服务名称
@RequestMapping("jifen")
public interface JiFenApi {

    @GetMapping("getJiFen")
    public JiFen getJiFen();
}
