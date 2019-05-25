package com.service.impl.zj;

import com.dao.zj.TeacherMapper;
import com.pojo.zj.Teacher;
import com.service.zj.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherMapper teacherMapper;
    @Override
    public List<Teacher> showtt(String username) {
        return teacherMapper.selbytt(username);
    }

}
