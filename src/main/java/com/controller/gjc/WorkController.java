package com.controller.gjc;


import com.pojo.gjc.Work;
import com.service.gjc.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/work")
public class WorkController {
    @Autowired
    WorkService workService;
    //查询
    @RequestMapping(value = "/showAll")
    public String showAll(Model model) {
        List<Work> works = workService.showAllwork();
        model.addAttribute("students",works);
        return "work/WorkShowAll";
    }

    //json
    @RequestMapping("/show")
    @ResponseBody
    public List<Work> inquire() {
        return workService.showAllwork();
    }

    //查询一个
    @RequestMapping("/showOne")
    public String showOne(Work work, Model model){
        System.out.println(work.getStudentid());
        List<Work> works=workService.selectByStudentId(work.getStudentid());
        model.addAttribute("work1",works);
       return "work/WorkShowOne";

    }


    //增加
    @RequestMapping("/add")
    public String add(Work work){
        workService.addWork(work);
        //重定向到查询方法
        return "redirect:/work/showAll";
    }
    //跳转到增加页面
    @RequestMapping("/toadd")
    public String jump(){
        return "work/WorkAdd";
    }
    //删除
    @RequestMapping("/delete")
    public String del(Work work){
        workService.delete(work);
        return "redirect:/work/showAll";
    }
    //跳转修改界面
    @RequestMapping("/toupdata")
    public String jumpup(Work work,Model model){
        Work work1=workService.showById(work);
        model.addAttribute("work",work1);
        return "work/WorkUpdata";
    }
    //修改
    @RequestMapping("updata")
    public String upda(Work work){
            workService.updataWork(work);
            return "redirect:/work/showAll";
    }

}
