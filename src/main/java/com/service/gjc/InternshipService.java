package com.service.gjc;


import com.pojo.gjc.Internship;

import java.util.List;

public interface InternshipService {
    List<Internship> showAllinternship();
    List<Internship> selectByStudentId(int a);
    void  addInternship(Internship internship);
    void  delete(Internship internship);
    void  updata(Internship internship);
    Internship showById(Internship internship);
}
