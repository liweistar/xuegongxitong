package com.dao.ch;

import com.pojo.ch.Science;
import com.pojo.ch.ScienceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScienceMapper {
    int countByExample(ScienceExample example);

    int deleteByExample(ScienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Science record);

    int insertSelective(Science record);

    List<Science> selectByExample(ScienceExample example);

    Science selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Science record, @Param("example") ScienceExample example);

    int updateByExample(@Param("record") Science record, @Param("example") ScienceExample example);

    int updateByPrimaryKeySelective(Science record);

    int updateByPrimaryKey(Science record);
}