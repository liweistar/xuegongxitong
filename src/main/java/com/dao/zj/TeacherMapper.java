package com.dao.zj;

import com.pojo.zj.Teacher;

import java.util.List;

public interface TeacherMapper {
    List<Teacher>selbytt(String username);
    Teacher selbyte(String username);
}
