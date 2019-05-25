package com.controller.zj;


import com.pojo.xlw.Users;
import com.pojo.zj.Feedback;
import com.pojo.zj.Teacher;
import com.service.zj.FeedbackService;
import com.service.zj.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class FeedbackController {
    @Resource
    private FeedbackService feedbackService;

    @RequestMapping("inscon")
    public String insfb(HttpServletRequest req) {
        Users user=(Users)req.getSession().getAttribute("users2");
        Teacher tea=feedbackService.showte(user.getUsername());
        feedbackService.ins(tea.getTname(),req.getParameter("content"));
        return "redirect:feedback.jsp";
    }
     @RequestMapping("selcontent")
    @ResponseBody
    public List<Feedback> show(HttpServletRequest req, HttpSession session){
         Users user=(Users)req.getSession().getAttribute("users2");
         Teacher tea=feedbackService.showte(user.getUsername());
         return feedbackService.show(tea.getTname());
        }
    }
