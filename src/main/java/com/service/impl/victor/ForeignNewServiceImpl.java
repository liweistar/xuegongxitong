package com.service.impl.victor;


import com.dao.victor.ForeignNewMapper;
import com.pojo.victor.ForeignNew;
import com.service.victor.ForeignNewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ForeignNewServiceImpl implements ForeignNewService {
	@Resource
	private ForeignNewMapper foreignNewMapper;

	@Override
	public List<ForeignNew> show() {
		// TODO Auto-generated method stub
		return foreignNewMapper.selAll();
	}

	@Override
	public int insForeignNew(ForeignNew foreignnew) {
		// TODO Auto-generated method stub
		return foreignNewMapper.insNew(foreignnew);
	}

	@Override
	public int delForeignNew(int foreignnid) {
		// TODO Auto-generated method stub
		return foreignNewMapper.delNew(foreignnid);
	}

	@Override
	public int updForeignNewById(ForeignNew foreignnew) {
		// TODO Auto-generated method stub
		return foreignNewMapper.updForeignNewById(foreignnew);
	}
	

	
}
