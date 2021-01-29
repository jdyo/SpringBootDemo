package com.example.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @description: You can verify that it works by visiting http://localhost:8080/ws/countries.wsdl
 * @param null
 * @return
 * @throws
 * @author jdyo
 * @date 2021/1/29 17:05
**/
@SpringBootApplication
public class WebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebserviceApplication.class, args);
    }

}
