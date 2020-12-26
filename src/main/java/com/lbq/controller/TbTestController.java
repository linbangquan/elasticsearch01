package com.lbq.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lbq.service.TbTestService;

@Controller
@RequestMapping("/tbtest")
public class TbTestController {

	@Autowired
	private TbTestService tbTestService;
	
	@RequestMapping("/getCount")
	@ResponseBody
	public Map<String,Object> getCount() {
		Map<String,Object> map = new HashMap<>();
		map.put("count",tbTestService.getCount());
		return map;
	};
}
