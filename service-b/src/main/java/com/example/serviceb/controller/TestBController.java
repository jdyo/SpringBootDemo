package com.example.serviceb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description:
 * @Author:tangdianyan
 * @Date:Created in 9:32 2021/1/29
 * @Modified By:
 */
@RestController
public class TestBController {
    @Autowired
    private ServiceAFeignClient serviceAFeignClient;
    @Autowired
    private DiscoveryClient client;

    /**
     * @description:在b中调用a的服务
     * @param
     * @return java.lang.String
     * @throws
     * @author jdyo
     * @date 2021/1/29 11:27
    **/
    @RequestMapping("/call")
    public String call(){
        String result = serviceAFeignClient.testA();
        return "b to a 访问结果 ---" + result;
    }

    /**
     * 服务发现：可以得到当前在eureka中已注册的服务
     *
     * @return
     */
    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("SERVICE-A");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
