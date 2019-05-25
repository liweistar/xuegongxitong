package com.dao.zj;


import com.pojo.zj.Feedback;
import com.pojo.zj.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FeedbackMapper {
    int insFb(@Param("teaname") String teaname, @Param("content") String content);
    List<Feedback> selFb(String teaname);
    Teacher selbyte(String username);
}
