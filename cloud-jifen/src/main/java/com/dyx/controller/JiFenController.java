package com.dyx.controller;

import com.dyx.entry.JiFen;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jifen")
@RefreshScope
public class JiFenController {

    @Value("${pic.url}")
    String url;

    @GetMapping("getJiFen")
    public JiFen getJiFen() {

        return new JiFen("测试openfin", 24.0);
    }

    @GetMapping("test")
    public String test() {

        return url;
    }


}
