package com.example.demo.jdyo.dao.mapper.second;

import com.example.demo.jdyo.dao.entity.second.CoordActions;
import com.example.demo.jdyo.dao.entity.second.CoordActionsWithBLOBs;

public interface CoordActionsMapper {
    int deleteByPrimaryKey(String id);

    int insert(CoordActionsWithBLOBs record);

    int insertSelective(CoordActionsWithBLOBs record);

    CoordActionsWithBLOBs selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CoordActionsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CoordActionsWithBLOBs record);

    int updateByPrimaryKey(CoordActions record);
}