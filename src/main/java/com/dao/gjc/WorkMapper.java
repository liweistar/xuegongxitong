package com.dao.gjc;

import com.pojo.gjc.Work;

import java.util.List;

public interface WorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Work record);

    int insertSelective(Work record);

    Work selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Work record);

    int updateByPrimaryKey(Work record);

    List<Work> selectByAll();

    List<Work> selectByStudentId(int studentid);
}