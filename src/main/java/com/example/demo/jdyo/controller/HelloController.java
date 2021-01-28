package com.example.demo.jdyo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.jdyo.bean.TestBean;
import com.example.demo.jdyo.bean.User;
import com.example.demo.jdyo.service.GetDbService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Api
@RestController
public class HelloController {
    @Resource
    GetDbService rtFlowDevService;
    @Resource
    TestBean testBean;

    @GetMapping("/helloDb")
    public String helloDb() {
        System.out.println("test ==>> "+ testBean.test);
        rtFlowDevService.printDbTables();
        return "Hello World!";
    }
    @ApiOperation(value = "hello" ,  notes="hello")
    @GetMapping("/hello")
    public String hello() {
        System.out.println("test ==>> "+ testBean.test);
        return "Hello World!";
    }

    @ApiOperation(value = "通过form表单获取参数" ,  notes="通过form表单获取参数")
    @ApiImplicitParam(name = "name", value = "name", required = true, paramType = "form", dataType = "String")
    @GetMapping("/getBodyParam")
    public String getBodyParam(@RequestParam String name) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("hello, my name is ").append(name).append(" from body");
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

    @ApiOperation(value = "通过path获取参数" ,  notes="通过path获取参数")
    @ApiImplicitParam(name = "name", value = "name", required = true, paramType = "path", dataType = "String")
    @GetMapping("/getPathParam/{name}")
    public String getPathParam(@PathVariable("name") String name) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("hello, my name is ").append(name).append(", from path");
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }
    @ApiOperation(value = "getParam default" ,  notes="getParam default")
    @ApiImplicitParam(name = "name", value = "name", required = true, paramType = "path", dataType = "String")
    @GetMapping("/getParam")
    public String getParam(String name) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("hello, my name is ").append(name).append(", from path");
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }

    @ApiOperation(value = "新建UserEntity实体" ,  notes="新建UserEntity实体")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, paramType = "path", dataType = "String"),
            @ApiImplicitParam(name = "configlist", value = "用户配置", required = true, paramType = "form", dataType = "String")
    })
    @PutMapping("/setEntity/{id}")
    public List<User> setEntity(@PathVariable("id") Integer id,@RequestBody(required = true) List<HashMap<String,String>> configlist) {
        List<User> configList = new LinkedList<>();
        for (HashMap<String,String> config : configlist) {
            User user=new User();
            HashMap<String, String> userMap = JSON.parseObject(JSONObject.toJSONString(config), HashMap.class);
            user.setName(userMap.get("name"));
            user.setId(id);
            user.setPassword("123456");
            user.setRole("admin");
            user.setPermission("777");
            configList.add(user);
        }
        return configList;
    }
}
