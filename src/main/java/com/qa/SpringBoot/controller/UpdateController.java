package com.qa.SpringBoot.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringBoot.Services.UserinfoServices;
import com.qa.SpringBoot.pojo.Userinfo;

@RequestMapping("/updateController")
@RestController
public class UpdateController {
      
	  @Autowired
	  UserinfoServices us;
	
	  @RequestMapping("/update")
	  public  Map<String, Object>  UpdateUinfo(Userinfo u){
		    
		    System.out.println(u);
		     Map<String, Object> map=new HashMap<String, Object>();
	        Userinfo userinfo = us.Update(u);
	         map.put("userinfo",userinfo);
		  
		  return map;
	  }
	
	
	
	
}
