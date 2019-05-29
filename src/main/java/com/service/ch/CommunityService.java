package com.service.ch;

import com.pojo.ch.Community;

import java.util.List;

/**
 * @author level
 * @create 2019/5/26 - 20:52
 */
public interface CommunityService {
    //增加
    void  addCommunity(Community community);
    //删除
    void  deleteCommunity(Community community);
    //修改
    void  updateCommunity(Community community);
    //查询
    List<Community> selectAllCommunity();
    //条件查询
    Community selectById(Community community);
    //根据名字查询
     List<Community> selectByCodeid(Community community);
}
