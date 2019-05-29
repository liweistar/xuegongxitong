package com.service.impl.gjc;


import com.dao.gjc.SpayMapper;
import com.pojo.gjc.Spay;
import com.service.gjc.SpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SpayService")
public class SpayServiceImpl implements SpayService {
    @Autowired
    SpayMapper spayMapper;

    @Override
    public List<Spay> showAllspay() {
        return spayMapper.selectByAll();
    }

    @Override
    public List<Spay> selectByStudentId(int a) {
        return spayMapper.selectByStudentId(a);
    }

    @Override
    public void addSpay(Spay spay) {
        spayMapper.insertSelective(spay);
    }

    @Override
    public void delete(Spay spay) {
        spayMapper.deleteByPrimaryKey(spay.getId());
    }

    @Override
    public void updata(Spay spay) {
        spayMapper.updateByPrimaryKeySelective(spay);
    }

    @Override
    public Spay showById(Spay spay) {
        Spay spay1=spayMapper.selectByPrimaryKey(spay.getId());
        return spay1;
    }
}
/*@Service("InternshipService")

    @Override
    public Internship showById(Internship internship) {
        Internship internship1=internshipMapper.selectByPrimaryKey(internship.getId());
        return internship1;
    }*/