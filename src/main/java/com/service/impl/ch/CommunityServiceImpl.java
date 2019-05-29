package com.service.impl.ch;

import com.dao.ch.CommunityMapper;
import com.pojo.ch.Community;
import com.pojo.ch.CommunityExample;
import com.service.ch.CommunityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author level
 * @create 2019/5/26 - 20:57
 */
@Service
public class CommunityServiceImpl implements CommunityService {
    @Resource
    CommunityMapper communityMapper;

    @Override
    public void addCommunity(Community community) {
        communityMapper.insertSelective(community);
    }

    @Override
    public void deleteCommunity(Community community) {
        communityMapper.deleteByPrimaryKey(community.getId());
    }

    @Override
    public void updateCommunity(Community community) {
        communityMapper.updateByPrimaryKeySelective(community);
    }

    @Override
    public List<Community> selectAllCommunity() {
        CommunityExample example = new CommunityExample();
        List<Community> c = communityMapper.selectByExample(example);
        return c;
    }

    @Override
    public Community selectById(Community community) {
        Community c = communityMapper.selectByPrimaryKey(community.getId());
        return c;
    }

    @Override
    public List<Community> selectByCodeid(Community community) {
        CommunityExample example = new CommunityExample();
        CommunityExample.Criteria criteria = example.createCriteria();
        criteria.andCodeidEqualTo(community.getCodeid());
        List<Community> c = communityMapper.selectByExample(example);
        return c;
    }
}

