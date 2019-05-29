package com.dao.victor;


import com.pojo.victor.ClubNew;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ClubNewMapper {

	/**
	 * 添加公告
	 * @param ClubNew
	 * @return
	 */
	@Insert("insert into clubNews values(default,#{clubnewtitle},#{clubnewcontent})")
	int insNew(ClubNew clubNew);
	/**
	 * 删除公告
	 * @param clubnid
	 * @return
	 */
	@Delete("delete from clubNews where clubnid =#{clubnid}")
	int delNew(int clubnid);
	/**
	 * 查询所有公告
	 * @return
	 */
	@Select("select * from clubNews")
	List<ClubNew> selAll();
	/**
	 * 修改对应公告
	 * @return
	 */
	@Update("update clubnews set clubnewtitle = #{clubnewtitle}, clubnewcontent=#{clubnewcontent} where clubnid=#{clubnid}")
	int updClubNewById(ClubNew clubNew);
}
