package com.service.victor;


import com.pojo.victor.Photo;

import java.util.List;

public interface PhotoService {

	List<Photo> show();
	int insPhoto(Photo photo);
	int delPhoto(int photoid);
}
