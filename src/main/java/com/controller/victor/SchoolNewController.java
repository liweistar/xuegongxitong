package com.controller.victor;


import com.pojo.victor.SchoolNew;
import com.service.victor.SchoolNewService;
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
public class SchoolNewController {

	@Resource
	private SchoolNewService schoolNewServiceImpl;
	/**
	 * json方式  查询所有公告
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("src/schoolnew/show")
    @ResponseBody
    public Map<String,Object> show() throws Exception {
		Map<String,Object> hashMap = new HashMap<String,Object>();
		List<SchoolNew> show = new ArrayList<>();
		show = schoolNewServiceImpl.show();
		hashMap.put("data", show);
		hashMap.put("code", "1000");
		hashMap.put("code", "1000");
		hashMap.put("code", "0");
        return hashMap;
    }
	/**
	 * 添加公告
	 * @param schoolNew
	 * @return
	 */
	@RequestMapping("src/schoolnew/ins")
	@ResponseBody
	public String insNew(SchoolNew schoolNew){
		int index = schoolNewServiceImpl.insSchoolNew(schoolNew);
			return "src/schoolnew/show";
	}
	/**
	 * 删除公告
	 * @param schoolnid
	 * @return
	 */
	@RequestMapping("src/schoolnew/del")
	public String delNew(int schoolnid){
		int index = schoolNewServiceImpl.delSchoolNew(schoolnid);
			return "redirect:/src/schoolnew/show";
	}
	/**
	 * 修改公告
	 * @param model
	 * @param schoolnid
	 * @return
	 */
	@RequestMapping("src/schoolnew/upd")
	public String show(Model model, SchoolNew schoolNew){
		int i = schoolNewServiceImpl.updSchoolNewById(schoolNew);
		return "redirect:/src/schoolnew/show";
	}
}
