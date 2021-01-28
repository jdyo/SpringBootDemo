package com.example.demo.jdyo.dao.mapper.master;

import com.example.demo.jdyo.dao.entity.master.GdfFlowManager;

public interface GdfFlowManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GdfFlowManager record);

    int insertSelective(GdfFlowManager record);

    GdfFlowManager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GdfFlowManager record);

    int updateByPrimaryKey(GdfFlowManager record);
}