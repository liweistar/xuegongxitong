package com.service.victor;


import com.pojo.victor.ClubNew;

import java.util.List;

public interface ClubNewService {

	/**
	 * 查询所有公告
	 * @return
	 */
	List<ClubNew> show();
	/**
	 * 添加公告
	 * @param ClubNew
	 * @return
	 */
	int insClubNew(ClubNew clubNew);
	/**
	 * 删除公告
	 * @param clubnid
	 * @return
	 */
	int delClubNew(int clubnid);
	/**
	 * 修改对应公告
	 * @param ClubNew
	 * @return
	 */
	int updClubNewById(ClubNew clubNew);
	
}
