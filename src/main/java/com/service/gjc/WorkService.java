package com.service.gjc;


import com.pojo.gjc.Work;

import java.util.List;

public interface WorkService {
    List<Work> showAllwork();

    void addWork(Work work);

    void delete(Work work);

    //根据id条件查询

    Work showById(Work work);
    //修改
    void updataWork(Work work);

    List<Work> selectByStudentId(int a);
}
