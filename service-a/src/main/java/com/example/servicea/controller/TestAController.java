package com.example.servicea.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author:tangdianyan
 * @Date:Created in 9:20 2021/1/29
 * @Modified By:
 */
@RestController
public class TestAController {

    @RequestMapping("/testA")
    public String testA(){
        return "Hello,SpringCloud for TestA";
    }
}
