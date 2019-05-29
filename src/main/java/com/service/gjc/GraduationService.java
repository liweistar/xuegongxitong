package com.service.gjc;


import com.pojo.gjc.Graduation;

import java.util.List;

public interface GraduationService {
    List<Graduation> showAllgraduation();
    List<Graduation> selectByStudentId(int a);
    void addGraduation(Graduation graduation);
    void delete(Graduation graduation);
    void updata(Graduation graduation);
    Graduation showById(Graduation graduation);

}
