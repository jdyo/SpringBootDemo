package com.example.demo.jdyo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author:tangdianyan
 * @Date:Created in 15:56 2020/10/17
 * @Modified By:
 */
@Component
@PropertySource({"classpath:application.properties"})
public class TestBean {
    public String test;

    @Value("${test}")
    public  void setTest(String test) {
        this.test = test;
    }
}
