package com.service.impl.victor;

import java.util.List;

import javax.annotation.Resource;

import com.dao.victor.PhotoMapper;
import com.pojo.victor.Photo;
import com.service.victor.PhotoService;
import org.springframework.stereotype.Service;



@Service
public class PhotoServiceImpl implements PhotoService {

	@Resource
	private PhotoMapper photoMapper;
	
	@Override
	public int insPhoto(Photo photo) {
		// TODO Auto-generated method stub
		return photoMapper.insPhoto(photo);
	}

	@Override
	public List<Photo> show() {
		// TODO Auto-generated method stub
		return photoMapper.selAll();
	}

	@Override
	public int delPhoto(int photoid) {
		// TODO Auto-generated method stub
		return photoMapper.delNew(photoid);
	}

}
