package com.dao.victor;


import com.pojo.victor.ForeignNew;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ForeignNewMapper {

	/**
	 * 添加公告
	 * @param ForeignNew foreign
	 * @return
	 */
	@Insert("insert into foreignnews values(default,#{foreignnewtitle},#{foreignnewcontent})")
	int insNew(ForeignNew foreignew);
	/**
	 * 删除公告
	 * @param foreignnid
	 * @return
	 */
	@Delete("delete from foreignnews where foreignnid =#{foreignnid}")
	int delNew(int foreignnid);
	/**
	 * 查询所有公告
	 * @return
	 */
	@Select("select * from foreignnews")
	List<ForeignNew> selAll();
	/**
	 * 修改对应公告
	 * @return
	 */
	@Update("update foreignnews set foreignnewtitle = #{foreignnewtitle}, foreignnewcontent=#{foreignnewcontent} where foreignnid=#{foreignnid}")
	int updForeignNewById(ForeignNew foreignew);
}
