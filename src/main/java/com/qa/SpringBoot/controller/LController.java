package com.qa.SpringBoot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringBoot.Services.UserServices;
import com.qa.SpringBoot.pojo.User;
import com.qa.SpringBoot.pojo.Userinfo;


@RequestMapping("/userController")
@RestController
public class LController {

	@Autowired
	UserServices us;
   
	
	@RequestMapping("/login")
	public Object  login(String username,String password){
		
		
		User user = us.selectUserBypwdAndName(username, password);
  
		Map<String, Object> map=new HashMap<String, Object>();
		
		if(user!=null){
			Integer userid = user.getUserid();
			if(userid!=null){
				Userinfo userinfo = us.selectByUid(userid);
				map.put("userinfo", userinfo);
				map.put("user", user);
			}
			
		}
		
		
	return  map;
}
	
	
	
	
	
	
	
	
	
}