package com.example.demo.jdyo.service;

import com.example.demo.jdyo.dao.mapper.master.WorkflowLogMapper;
import com.example.demo.jdyo.dao.mapper.second.CoordActionsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author:tangdianyan
 * @Date:Created in 14:12 2021/1/20
 * @Modified By:
 */
@Service
public class GetDbService {
    @Resource
    WorkflowLogMapper workflowLogMapper;
    @Resource
    CoordActionsMapper coordActionsMapper;
    public void printDbTables(){
        System.out.println(workflowLogMapper.selectByPrimaryKey(2).getNodeName());
        System.out.println(coordActionsMapper.selectByPrimaryKey("0001716-200711021334724-oozie-oozi-C@369"));
    }
}
