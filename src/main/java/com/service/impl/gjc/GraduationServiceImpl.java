package com.service.impl.gjc;


import com.dao.gjc.GraduationMapper;
import com.pojo.gjc.Graduation;
import com.service.gjc.GraduationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("graduationService")
public class GraduationServiceImpl implements GraduationService {
    @Autowired
    GraduationMapper graduationMapper;

    @Override
    public List<Graduation> showAllgraduation() {
        return graduationMapper.selectByAll();
    }

    @Override
    public List<Graduation> selectByStudentId(int a) {
        return graduationMapper.selectByStudentId(a);
    }

    @Override
    public void addGraduation(Graduation graduation) {
        graduationMapper.insertSelective(graduation);
    }


    @Override
    public void delete(Graduation graduation) {
        graduationMapper.deleteByPrimaryKey(graduation.getId());
    }

    @Override
    public void updata(Graduation graduation) {
        graduationMapper.updateByPrimaryKeySelective(graduation);
    }

    @Override
    public Graduation showById(Graduation graduation) {
        Graduation graduation1=graduationMapper.selectByPrimaryKey(graduation.getId());
        return graduation1;
    }
}
