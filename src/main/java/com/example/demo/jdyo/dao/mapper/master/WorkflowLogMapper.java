package com.example.demo.jdyo.dao.mapper.master;

import com.example.demo.jdyo.dao.entity.master.WorkflowLog;

public interface WorkflowLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WorkflowLog record);

    int insertSelective(WorkflowLog record);

    WorkflowLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WorkflowLog record);

    int updateByPrimaryKeyWithBLOBs(WorkflowLog record);

    int updateByPrimaryKey(WorkflowLog record);
}