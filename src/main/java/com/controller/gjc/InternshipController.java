package com.controller.gjc;


import com.pojo.gjc.Internship;
import com.service.gjc.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/internship")
public class InternshipController {
    @Autowired
    InternshipService internshipService;

    @RequestMapping(value = "/showAll")
    public String showAll(Model model){
        List<Internship> internships=internshipService.showAllinternship();
        model.addAttribute("intstudents",internships);
        return "internship/InternshipShowAll";
    }

    @RequestMapping("/showOne")
    public String showOne(Internship internship,Model model){
        System.out.println(internship.getStudentid());
        List<Internship> internships=internshipService.selectByStudentId(internship.getStudentid());
        model.addAttribute("internship1",internships);
        return "internship/InternshipShowOne";
    }
    @RequestMapping("/add")
    public String add(Internship internship){
        internshipService.addInternship(internship);
        return "redirect:/internship/showAll";
    }
    @RequestMapping("/toadd")
    public String jump(){return "internship/InternshipAdd";}

    @RequestMapping("/delete")
    public  String del(Internship internship){
        internshipService.delete(internship);
        return "redirect:/internship/showAll";
    }

    @RequestMapping("/updata")
    public String upda(Internship internship){
        internshipService.updata(internship);
        return "redirect:/internship/showAll";
    }
    @RequestMapping("/toupdata")
    public String jumpup(Internship internship,Model model){
        Internship internship1=internshipService.showById(internship);
        model.addAttribute("internship",internship1);
        return "internship/InternshipUpdata";
    }
}
