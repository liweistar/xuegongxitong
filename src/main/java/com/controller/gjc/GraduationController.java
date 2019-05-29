package com.controller.gjc;


import com.pojo.gjc.Graduation;
import com.service.gjc.GraduationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/graduation")
public class GraduationController {
    @Autowired
    GraduationService graduationService;
    //查询
    @RequestMapping(value = "/showAll")
    public String showAll(Model model){
        List<Graduation> graduations=graduationService.showAllgraduation();
        model.addAttribute("grastudents",graduations);
        return "graduation/GraduationShowAll";
    }
    //查询一个
    @RequestMapping("/showOne")
    public String showOne(Graduation graduation,Model model){
        System.out.println(graduation.getStudentid());
        List<Graduation> graduations=graduationService.selectByStudentId(graduation.getStudentid());
        model.addAttribute("graduation1",graduations);
        return "graduation/GraduationShowOne";
    }
    @RequestMapping("/add")
    public String add(Graduation graduation){
        graduationService.addGraduation(graduation);
        return "redirect:/graduation/showAll";
    }
    @RequestMapping("toadd")
    public String jump(){
        return "graduation/GraduationAdd";
    }

    @RequestMapping("/delete")
    public String del(Graduation graduation){
        graduationService.delete(graduation);
        return "redirect:/graduation/showAll";
    }
    @RequestMapping("/updata")
    public String upda(Graduation graduation){
        graduationService.updata(graduation);
        return "redirect:/graduation/showAll";
    }
    @RequestMapping("/toupdata")
    public String jumpup(Graduation graduation,Model model){
        Graduation graduation1=graduationService.showById(graduation);
        model.addAttribute("graduation",graduation1);
        return "graduation/GraduationUpdata";
    }
}
