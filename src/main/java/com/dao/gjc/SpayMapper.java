package com.dao.gjc;


import com.pojo.gjc.Spay;

import java.util.List;

public interface SpayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Spay record);

    int insertSelective(Spay record);

    Spay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Spay record);

    int updateByPrimaryKey(Spay record);
    List<Spay> selectByAll();
    List<Spay> selectByStudentId(int studentid);
}