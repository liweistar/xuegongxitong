package com.service.impl.gjc;


import com.dao.gjc.WorkMapper;
import com.pojo.gjc.Work;
import com.service.gjc.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("workService")
public class WorkServiceImpl implements WorkService {
    @Autowired
    WorkMapper workMapper;
    @Override
    public List<Work> showAllwork(){
        return workMapper.selectByAll();
    }

    @Override
    public void addWork(Work work) {
        workMapper.insertSelective(work);
    }

    @Override
    public void delete(Work work) {

        workMapper.deleteByPrimaryKey(work.getId());
    }

    @Override
    public Work showById(Work work) {

       Work work1 =workMapper.selectByPrimaryKey(work.getId());

        return work1;
    }

    @Override
    public void updataWork(Work work) {
        workMapper.updateByPrimaryKeySelective(work);
    }

    @Override
    public List<Work> selectByStudentId(int a) {
        return  workMapper.selectByStudentId(a);

    }

}
