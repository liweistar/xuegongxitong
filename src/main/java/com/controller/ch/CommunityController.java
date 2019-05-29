package com.controller.ch;

import com.pojo.ch.Community;
import com.pojo.xlw.Studentinformation;
import com.pojo.xlw.Users;
import com.service.ch.CommunityService;
import com.service.xlw.StudentinformationService;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.springframework.http.HttpRequest;
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
@RequestMapping("Community")
public class CommunityController {
    @Resource
    CommunityService communityService;
    @Resource
    StudentinformationService studentinformationService;
    @RequestMapping("AllCommunity")
    public String aaaa(){
        return "/community/allCommunity";
    }
    @RequestMapping("toAddCommunity")
    public String a(HttpSession session, Model model){
        Users users= (Users) session.getAttribute("users1");
        Community community=new Community();
        List<Studentinformation> studentinformations = studentinformationService.queryByCodeid(Integer.parseInt(users.getUsername()));
        community.setCommunity(studentinformations.get(0).getName());
        community.setSex(studentinformations.get(0).getSex());
        community.setPhone(Integer.valueOf(studentinformations.get(0).getNumber()));
        model.addAttribute("c",community);
        return "/community/addCommunity";
    }
    @RequestMapping("addCommunity")
    public String b(Community community,HttpSession session){
        Users users1 = (Users) session.getAttribute("users1");
        community.setCodeid(Integer.valueOf(users1.getUsername()));
        community.setIspass("无");
        communityService.addCommunity(community);
        return "redirect:/Community/toqueryMy";
    }
    @RequestMapping("All")
    @ResponseBody
    public List<Community> aa(){
        List<Community> s = communityService.selectAllCommunity();
        return s;
    }
    @RequestMapping("updatepower")
    public String aaa(Community community){
        Community community1 = communityService.selectById(community);
        if("通过".equals(community1.getIspass())){
            community1.setIspass("未通过");
            communityService.updateCommunity(community1);
        }else {
            community1.setIspass("通过");
            communityService.updateCommunity(community1);
        }
        return "redirect:/Community/AllCommunity";
    }
    //学生
    @RequestMapping("toqueryMy")
    public String aaaaa(){
        return "/community/allCommunityS";
    }
    @RequestMapping("queryMy")
    @ResponseBody
    public List<Community> aaaaa(Community community, HttpSession session){
        Users users= (Users) session.getAttribute("users1");
        community.setCodeid(Integer.valueOf(users.getUsername()));
        List<Community> communities = communityService.selectByCodeid(community);
        return communities;
    }
    @RequestMapping("delete")
    public String delete(Community community){
        communityService.deleteCommunity(community);
        return "redirect:/Community/toqueryMy";
    }

}
