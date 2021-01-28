package com.example.demo.jdyo.dao.mapper.master;

import com.example.demo.jdyo.dao.entity.master.GdfTaskManager;

public interface GdfTaskManagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GdfTaskManager record);

    int insertSelective(GdfTaskManager record);

    GdfTaskManager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GdfTaskManager record);

    int updateByPrimaryKey(GdfTaskManager record);
}