package com.controller.victor;


import com.pojo.victor.ForeignNew;
import com.service.victor.ForeignNewService;
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
public class ForeignNewController {

	@Resource
	private ForeignNewService foreignNewServiceImpl;
	/**
	 * json方式  查询所有公告
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("src/foreignnew/showforeignnew")
    @ResponseBody
    public Map<String,Object> show() throws Exception {
		Map<String,Object> hashMap = new HashMap<String,Object>();
		List<ForeignNew> show = new ArrayList<>();
		show = foreignNewServiceImpl.show();
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
	@RequestMapping("src/foreignnew/insforeignnew")
	@ResponseBody
	public String insNew(ForeignNew foreignnew){
		int index = foreignNewServiceImpl.insForeignNew(foreignnew);
			return "src/foreignnew/showforeignnew";
	}
	/**
	 * 删除公告
	 * @param 
	 * @return
	 */
	@RequestMapping("src/foreignnew/delforeignnew")
	public String delNew(int foreignnid){
		int index = foreignNewServiceImpl.delForeignNew(foreignnid);
			return "redirect:/src/foreignnew/showforeignnew";
	}
	/**
	 * 修改公告
	 * @param model
	 * @param 
	 * @return
	 */
	@RequestMapping("src/foreignnew/updforeignnew")
	public String show(Model model, ForeignNew foreignnew){
		int i = foreignNewServiceImpl.updForeignNewById(foreignnew);
		return "redirect:/src/foreignnew/showforeignnew";
	}
}
