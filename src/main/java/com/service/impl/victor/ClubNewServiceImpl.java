package com.service.impl.victor;


import com.dao.victor.ClubNewMapper;
import com.pojo.victor.ClubNew;
import com.service.victor.ClubNewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClubNewServiceImpl implements ClubNewService {
	@Resource
	private ClubNewMapper clubNewMapper;

	@Override
	public List<ClubNew> show() {
		// TODO Auto-generated method stub
		return clubNewMapper.selAll();
	}

	@Override
	public int insClubNew(ClubNew clubNew) {
		// TODO Auto-generated method stub
		return clubNewMapper.insNew(clubNew);
	}

	@Override
	public int delClubNew(int clubnid) {
		// TODO Auto-generated method stub
		return clubNewMapper.delNew(clubnid);
	}

	@Override
	public int updClubNewById(ClubNew clubNew) {
		// TODO Auto-generated method stub
		return clubNewMapper.updClubNewById(clubNew);
	}
	
	

	
}
