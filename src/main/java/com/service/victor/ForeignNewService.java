package com.service.victor;


import com.pojo.victor.ForeignNew;

import java.util.List;

public interface ForeignNewService {

	/**
	 * 查询所有公告
	 * @return
	 */
	List<ForeignNew> show();
	/**
	 * 添加公告
	 * @param ForeignNew
	 * @return
	 */
	int insForeignNew(ForeignNew foreignnew);
	/**
	 * 删除公告
	 * @param foreignnid
	 * @return
	 */
	int delForeignNew(int foreignnid);
	/**
	 * 修改对应公告
	 * @param ForeignNew
	 * @return
	 */
	int updForeignNewById(ForeignNew foreignnew);
	
}
