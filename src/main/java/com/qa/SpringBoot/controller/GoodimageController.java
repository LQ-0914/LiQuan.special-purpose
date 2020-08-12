package com.qa.SpringBoot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.qa.SpringBoot.Services.GoodimageServices;
import com.qa.SpringBoot.pojo.Goodsimage;

@RequestMapping("/goodimageController")
@RestController
public class GoodimageController {

	
	@Autowired
	GoodimageServices  gs;
	
	@RequestMapping("/goodimg")
	public  Map<String, Object>  getimgs(@RequestParam("count") Integer count){
		
		Map<String, Object> map =new HashMap<String, Object>();
	   
		List<Goodsimage> list = gs.Getimgs(count);
		
		map.put("goodimgs",list);
		
		return  map;
	}
	
	
	
	
}
