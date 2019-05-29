package com.controller.ch;


import com.pojo.ch.Science;
import com.pojo.xlw.Studentinformation;
import com.pojo.xlw.Users;
import com.service.ch.ScienceService;
import com.service.xlw.StudentinformationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author level
 * @create 2019/5/27 - 12:35
 */
@Controller
@RequestMapping("science")
public class ScienceController {
    @Resource
    ScienceService scienceService;
    @Resource
    StudentinformationService studentinformationService;
    @RequestMapping("Allscience")
    public String aaaa(){
        return "/science/allscience";
    }
    @RequestMapping("toAddscience")
    public String a(HttpSession session, Model model){
        Users users= (Users) session.getAttribute("users1");
        Science science=new Science();
        List<Studentinformation> studentinformations = studentinformationService.queryByCodeid(Integer.parseInt(users.getUsername()));
        science.setScience(studentinformations.get(0).getName());
        science.setSex(studentinformations.get(0).getSex());
        science.setPhone(studentinformations.get(0).getNumber());
        model.addAttribute("c",science);
        return "/science/addscience";
    }
    @RequestMapping("addscience")
    public String b(Science science,HttpSession session){
        Users users1 = (Users) session.getAttribute("users1");
        science.setCodeid(Integer.valueOf(users1.getUsername()));
        science.setIspass("无");
        scienceService.addScience(science);
        return "redirect:/science/toqueryMy";
    }
    @RequestMapping("All")
    @ResponseBody
    public List<Science> aa(){
        List<Science> s = scienceService.selectAllScience();
        return s;
    }
    @RequestMapping("updatepower")
    public String aaa(Science science){
        Science science1 = scienceService.selectById(science);
        if("通过".equals(science1.getIspass())){
            science1.setIspass("未通过");
            scienceService.updateScience(science1);
        }else {
            science1.setIspass("通过");
            scienceService.updateScience(science1);
        }
        return "redirect:/science/Allscience";
    }
    //学生
    @RequestMapping("toqueryMy")
    public String aaaaa(){
        return "/science/allscienceS";
    }
    @RequestMapping("queryMy")
    @ResponseBody
    public List<Science> aaaaa(Science science, HttpSession session){
        Users users= (Users) session.getAttribute("users1");
        science.setCodeid(Integer.valueOf(users.getUsername()));
        List<Science> communities = scienceService.selectByCodeid(science);
        return communities;
    }
    @RequestMapping("delete")
    public String delete(Science science){
        scienceService.deleteScience(science);
        return "redirect:/science/toqueryMy";
    }

}
