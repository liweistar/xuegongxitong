package com.controller.zj;

import com.pojo.xlw.Users;
import com.pojo.zj.Teacher;
import com.service.zj.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TeacherController {
    @Resource
    private TeacherService teacherService;
    @RequestMapping("tcourse")
    @ResponseBody
    public List<Teacher> show(HttpServletRequest req){
        Users user=(Users)req.getSession().getAttribute("users2");
        return teacherService.showtt(user.getUsername());
    }
}
