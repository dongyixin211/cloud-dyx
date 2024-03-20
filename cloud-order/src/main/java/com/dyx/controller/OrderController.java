package com.dyx.controller;

import com.dyx.api.JiFenApi;
import com.dyx.entry.Goods;
import com.dyx.entry.JiFen;
import com.rule.MyNacosRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("order")
@RibbonClient(name = "cloud-goods",configuration = {MyNacosRule.class})
public class OrderController {


    @Autowired
    RestTemplate restTemplate;
    @Autowired
    JiFenApi jiFenApi;


    @RequestMapping("save")
    public Map save(){

        // 远程调用goods服务
        String serverNmae ="cloud-goods";
        String url ="http://"+serverNmae+"/goods/findById/99";
        Goods forObject = restTemplate.getForObject(url, Goods.class);

        System.out.println(forObject);

        // 2.保存订单
        System.out.println("save order success!!");

        return new HashMap(){{put("code",200);put("msg","success");}};
    }


    @RequestMapping("test")
    public HashMap test(){
        Goods goods = new Goods("微服务测试", 100);

        String serverNmae ="cloud-goods";
        String url ="http://"+serverNmae+"/goods/save";
        HashMap hashMap = restTemplate.postForObject(url,goods, HashMap.class);
        System.out.println(hashMap);
       return hashMap;
    }



    @RequestMapping("test1")
    public HashMap test1(){

        JiFen jiFen = jiFenApi.getJiFen();
        return new HashMap(){{put("msg","success");put("data",jiFen);}};
    }

    @RequestMapping("test2")
    public String test2(){


      return "sentinel";
    }



}
