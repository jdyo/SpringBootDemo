package com.example.serviceb.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:在服务b中调用服务a的接口
 * @Author:tangdianyan
 * @Date:Created in 9:23 2021/1/29
 * @Modified By:
 */
// 填入注册中心中的应用名, 也就是要调用的微服务的应用名
// 在eureka页面中可以找到
@FeignClient("SERVICE-A")
public interface ServiceAFeignClient {

    @RequestMapping("testA")
    public String testA();
}
