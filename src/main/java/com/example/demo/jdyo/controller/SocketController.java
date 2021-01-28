package com.example.demo.jdyo.controller;
import com.alibaba.fastjson.JSON;
import com.example.demo.jdyo.server.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


/**
 * @Description:
 * @Author:tangdianyan
 * @Date:Created in 14:44 2020/12/15
 * @Modified By:
 */
@Controller
public class SocketController {
    @Autowired
    private WebSocketServer webSocketServer;

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "index";
    }

    @GetMapping("/webSocket")
    @ResponseBody
    public ModelAndView socket() {
        ModelAndView mav=new ModelAndView("webSocket");
//        mav.addObject("userId", userId);
        return mav;
    }

    @GetMapping("/log")
    @ResponseBody
    public ModelAndView log(String jobId) {
        ModelAndView mav=new ModelAndView("logStashRecord");
        System.out.println(jobId);
        mav.addObject("jobId", JSON.toJSONString("jdyo001"));
        return mav;
    }

}
