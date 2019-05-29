package com.service.impl.ch;

import com.dao.ch.ScienceMapper;
import com.pojo.ch.Science;
import com.pojo.ch.ScienceExample;
import com.service.ch.ScienceService;
import com.service.ch.ScienceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author level
 * @create 2019/5/26 - 20:57
 */
@Service
public class ScienceServiceImpl implements ScienceService {
    @Resource
    ScienceMapper scienceMapper;

    @Override
    public void addScience(Science science) {
        scienceMapper.insertSelective(science);
    }

    @Override
    public void deleteScience(Science science) {
        scienceMapper.deleteByPrimaryKey(science.getId());
    }

    @Override
    public void updateScience(Science science) {
        scienceMapper.updateByPrimaryKeySelective(science);

    }

    @Override
    public List<Science> selectAllScience() {
        ScienceExample example = new ScienceExample();
        List<Science> c = scienceMapper.selectByExample(example);
        return c;
    }

    @Override
    public Science selectById(Science science) {
        Science c = scienceMapper.selectByPrimaryKey(science.getId());
        return c;
    }

    @Override
    public List<Science> selectByCodeid(Science Science) {
        ScienceExample example = new ScienceExample();
        ScienceExample.Criteria criteria = example.createCriteria();
        criteria.andCodeidEqualTo(Science.getCodeid());
        List<Science> c = scienceMapper.selectByExample(example);
        return c;
    }
}

