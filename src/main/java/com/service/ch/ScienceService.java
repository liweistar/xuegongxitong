package com.service.ch;

import com.pojo.ch.Science;

import java.util.List;

/**
 * @author level
 * @create 2019/5/26 - 20:52
 */
public interface ScienceService {
    //增加
    void  addScience(Science science);
    //删除
    void  deleteScience(Science science);
    //修改
    void  updateScience(Science science);
    //查询
    List<Science> selectAllScience();
    //条件查询
    Science selectById(Science science);
    //根据名字查询
     List<Science> selectByCodeid(Science science);
}
