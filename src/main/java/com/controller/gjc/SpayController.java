package com.controller.gjc;


import com.pojo.gjc.Spay;
import com.service.gjc.SpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/spay")
public class SpayController {
    @Autowired
    SpayService spayService;
    @RequestMapping(value = "/showAll")
    public  String showAll(Model model){
        List<Spay> spays=spayService.showAllspay();
        model.addAttribute("spastudents",spays);
        return "spay/SpayShowAll";
    }
    @RequestMapping("/showOne")
    public String showOne(Spay spay,Model model){
        System.out.println(spay.getStudentid());
        List<Spay> spays=spayService.selectByStudentId(spay.getStudentid());
        model.addAttribute("spay1",spays);
        return "spay/SpayShowOne";
    }
    @RequestMapping("/add")
    public String add(Spay spay){
        spayService.addSpay(spay);
        return "redirect:/spay/showAll";
    }
    @RequestMapping("/toadd")
    public String jump(){return "spay/SpayAdd";}

    @RequestMapping("/delete")
    public String del(Spay spay){
        spayService.delete(spay);
        return "redirect:/spay/showAll";
    }

    @RequestMapping("/updata")
    public String upda(Spay spay){
        spayService.updata(spay);
        return "redirect:/spay/showAll";
    }
    @RequestMapping("/toupdata")
    public String jumpup(Spay spay,Model model){
        Spay spay1=spayService.showById(spay);
        model.addAttribute("spay",spay1);
        return "spay/SpayUpdata";
    }
}
