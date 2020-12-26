package com.lbq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbq.dao.TbTestMapper;
import com.lbq.service.TbTestService;
@Service
public class TbTestServiceImpl implements TbTestService {

	@Autowired
	private TbTestMapper tbTestMapper;
	
	@Override
	public Integer getCount() {
		return tbTestMapper.getCount();
	}

}
