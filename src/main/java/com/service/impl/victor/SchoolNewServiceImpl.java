package com.service.impl.victor;


import com.dao.victor.SchoolNewMapper;
import com.pojo.victor.SchoolNew;
import com.service.victor.SchoolNewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SchoolNewServiceImpl implements SchoolNewService {
	@Resource
	private SchoolNewMapper schoolNewMapper;
	/**
	 * 查询所有公告
	 * @return
	 */
	@Override
	public List<SchoolNew> show() {
		// TODO Auto-generated method stub
		return schoolNewMapper.selAll();
	}
	/**
	 * 添加公告
	 * @param Schoolnew
	 * @return
	 */
	@Override
	public int insSchoolNew(SchoolNew schoolNew) {
		return schoolNewMapper.insNew(schoolNew);
	}
	/**
	 * 删除公告
	 * @param schoolnid
	 * @return
	 */
	@Override
	public int delSchoolNew(int schoolnid) {
		return schoolNewMapper.delNew(schoolnid);
	}
	/**
	 * 修改公告
	 */
	@Override
	public int updSchoolNewById(SchoolNew schoolNew) {
		// TODO Auto-generated method stub
		return schoolNewMapper.updSchoolNewById(schoolNew);
	}
	
	

	
}
