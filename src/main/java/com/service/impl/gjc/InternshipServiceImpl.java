package com.service.impl.gjc;


import com.dao.gjc.InternshipMapper;
import com.pojo.gjc.Internship;
import com.service.gjc.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("InternshipService")
public class InternshipServiceImpl implements InternshipService {
    @Autowired
    InternshipMapper internshipMapper;

    @Override
    public List<Internship> showAllinternship() {
        return internshipMapper.selectByAll();
    }

    @Override
    public List<Internship> selectByStudentId(int a) {
        return internshipMapper.selectByStudentId(a);
    }

    @Override
    public void addInternship(Internship internship) {
        internshipMapper.insertSelective(internship);

    }

    @Override
    public void delete(Internship internship) {
        internshipMapper.deleteByPrimaryKey(internship.getId());
    }

    @Override
    public void updata(Internship internship) {
        internshipMapper.updateByPrimaryKeySelective(internship);
    }

    @Override
    public Internship showById(Internship internship) {
        Internship internship1=internshipMapper.selectByPrimaryKey(internship.getId());
        return internship1;
    }
}
