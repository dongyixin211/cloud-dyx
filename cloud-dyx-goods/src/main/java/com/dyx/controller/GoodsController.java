package com.dyx.controller;

import com.dyx.entry.Goods;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("goods")
public class GoodsController {

    @Value("${server.port}")
    String port;

    @RequestMapping("findById/{id}")
    public Goods findById(@PathVariable String id) {
        System.out.println("id:" + id);
        return new Goods("董宜新" + port, 10000);
    }


    @PostMapping("save")
    public HashMap save(@RequestBody Goods goods) {
        System.out.println(goods);
        return new HashMap() {{
            put("code", 200);
            put("msg", "goods save  success");
        }};
    }
}
