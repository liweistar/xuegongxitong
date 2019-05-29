package com.controller.victor;


import com.pojo.victor.Photo;
import com.service.victor.PhotoService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
public class PhotoController {

	@Resource
	private PhotoService photoServiceImpl;
	
	@RequestMapping("src/photo/showphoto")
    @ResponseBody
    public Map<String,Object> show() throws Exception {
		Map<String,Object> hashMap = new HashMap<String,Object>();
		List<Photo> show = new ArrayList<>();
		show = photoServiceImpl.show();
		hashMap.put("data", show);
		hashMap.put("code", "1000");
		hashMap.put("code", "1000");
		hashMap.put("code", "0");
        return hashMap;
    }
	
	@RequestMapping("src/photo/insphoto")
	public String register(Photo photo, MultipartFile file, HttpServletRequest req){
		String fileName = UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String path = req.getServletContext().getRealPath("src/photo")+"/"+fileName;
		System.out.println(path);
		//String path = "E:/uploads/"+fileName;
		//String path = "D:\\workspace-idea\\xugong\\src\\main\\webapp\\src\\photo\\"+fileName;
		try {
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		//只能取到webapps文件夹内容
		photo.setPhoto(fileName);
		int index = photoServiceImpl.insPhoto(photo);
		if(index>0){
			return "redirect:/src/photo/showphoto";
		}else{
			return "redirect:/src/photo/showphoto";
		}
	}
	/**
	 * 删除
	 * @param 
	 * @return
	 */
	@RequestMapping("src/photo/delphoto")
	public String delNew(int photoid){
		int index = photoServiceImpl.delPhoto(photoid);
			return "redirect:/src/photo/showphoto";
	}
}
