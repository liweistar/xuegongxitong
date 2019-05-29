package com.dao.gjc;


import com.pojo.gjc.Internship;

import java.util.List;

public interface InternshipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Internship record);

    int insertSelective(Internship record);

    Internship selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Internship record);

    int updateByPrimaryKey(Internship record);
    List<Internship> selectByAll();
    List<Internship> selectByStudentId(int studentid);
}