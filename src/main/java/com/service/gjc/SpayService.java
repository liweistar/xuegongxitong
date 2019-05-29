package com.service.gjc;


import com.pojo.gjc.Spay;

import java.util.List;

public interface SpayService {
    List<Spay> showAllspay();
    List<Spay> selectByStudentId(int a);
    void addSpay(Spay spay);
    void delete(Spay spay);
    void updata(Spay spay);
    Spay showById(Spay spay);
}
