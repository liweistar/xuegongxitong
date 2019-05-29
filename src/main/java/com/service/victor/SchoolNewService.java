package com.service.victor;


import com.pojo.victor.SchoolNew;

import java.util.List;

public interface SchoolNewService {

	/**
	 * 查询所有公告
	 * @return
	 */
	List<SchoolNew> show();
	/**
	 * 添加公告
	 * @param schoolNew
	 * @return
	 */
	int insSchoolNew(SchoolNew schoolNew);
	/**
	 * 删除公告
	 * @param schoolnid
	 * @return
	 */
	int delSchoolNew(int schoolnid);
	/**
	 * 修改对应公告
	 * @param schoolNew
	 * @return
	 */
	int updSchoolNewById(SchoolNew schoolNew);
	
}
