package com.dao.victor;


import com.pojo.victor.SchoolNew;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface SchoolNewMapper {

	/**
	 * 添加公告
	 * @param Schoolnew
	 * @return
	 */
	@Insert("insert into schoolnews values(default,#{schoolnewtitle},#{schoolnewcontent})")
	int insNew(SchoolNew schoolNew);
	/**
	 * 删除公告
	 * @param schoolnid
	 * @return
	 */
	@Delete("delete from schoolnews where schoolnid =#{schoolnid}")
	int delNew(int schoolnid);
	/**
	 * 查询所有公告
	 * @return
	 */
	@Select("select * from schoolnews")
	List<SchoolNew> selAll();
	/**
	 * 修改对应公告
	 * @return
	 */
	@Update("update schoolnews set schoolnewtitle = #{schoolnewtitle}, schoolnewcontent=#{schoolnewcontent} where schoolnid=#{schoolnid}")
	int updSchoolNewById(SchoolNew schoolNew);
}
