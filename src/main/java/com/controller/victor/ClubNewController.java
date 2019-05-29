package com.controller.victor;


import com.pojo.victor.ClubNew;
import com.service.victor.ClubNewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ClubNewController {

	@Resource
	private ClubNewService clubNewServiceImpl;
	/**
	 * json方式  查询所有公告
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("src/clubnew/showclubnew")
    @ResponseBody
    public Map<String,Object> show() throws Exception {
		Map<String,Object> hashMap = new HashMap<String,Object>();
		List<ClubNew> show = new ArrayList<>();
		show = clubNewServiceImpl.show();
		hashMap.put("data", show);
		hashMap.put("code", "1000");
		hashMap.put("code", "1000");
		hashMap.put("code", "0");
        return hashMap;
    }
	/**
	 * 添加公告
	 * @param 
	 * @return
	 */
	@RequestMapping("src/clubnew/insclubnew")
	@ResponseBody
	public String insNew(ClubNew clubNew){
		int index = clubNewServiceImpl.insClubNew(clubNew);
			return "src/clubnew/showclubnew";
	}
	/**
	 * 删除公告
	 * @param 
	 * @return
	 */
	@RequestMapping("src/clubnew/delclubnew")
	public String delNew(int clubnid){
		int index = clubNewServiceImpl.delClubNew(clubnid);
			return "redirect:/src/clubnew/showclubnew";
	}
	/**
	 * 修改公告
	 * @param model
	 * @param 
	 * @return
	 */
	@RequestMapping("src/clubnew/updclubnew")
	public String show(Model model, ClubNew clubNew){
		int i = clubNewServiceImpl.updClubNewById(clubNew);
		return "redirect:/src/clubnew/showclubnew";
	}
}
