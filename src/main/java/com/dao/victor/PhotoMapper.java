package com.dao.victor;


import com.pojo.victor.Photo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PhotoMapper {

	@Insert("insert into photos values(default,#{photo})")
	int insPhoto(Photo photo);
	@Select("select * from photos")
	List<Photo> selAll();
	/**
	 * 删除公告
	 * @param photoid
	 * @return
	 */
	@Delete("delete from photos where photoid =#{photoid}")
	int delNew(int photoid);
}
