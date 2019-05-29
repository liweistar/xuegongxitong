package com.dao.gjc;


import com.pojo.gjc.Graduation;

import java.util.List;

public interface GraduationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Graduation record);

    int insertSelective(Graduation record);

    Graduation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Graduation record);

    int updateByPrimaryKey(Graduation record);
    List<Graduation> selectByAll();
    List<Graduation> selectByStudentId(int studentid);
}