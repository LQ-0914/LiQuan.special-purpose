package com.qa.SpringBoot.SerivicesImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SpringBoot.Services.UserServices;
import com.qa.SpringBoot.mapper.UserMapper;
import com.qa.SpringBoot.mapper.UserinfoMapper;
import com.qa.SpringBoot.pojo.User;

import com.qa.SpringBoot.pojo.Userinfo;

@Service
public class UserServicesImpl implements UserServices{
    
	@Autowired
	UserMapper um;
	
	@Autowired
	UserinfoMapper uif;

	@Override
	public User selectUserBypwdAndName(String username, String password) {
		 
		 User user = um.selectUByPAndW(password, username);
		 
		return user;
	}

	@Override
	public Userinfo selectByUid(int userid) {
		
		Userinfo userinfo = uif.selectByPrimaryKey(userid);
		
		return userinfo;
	}

	@Override
	public void insertUser(User u) {
		
        um.insert(u);		
	}

	@Override
	public Integer selectByUname(String username) {
		
		 Integer userid= um.selectByUname(username);
		
		
		return userid;
	}

	
	public User selectByUID(int userid) {
		User user = um.selectByPrimaryKey(userid);
		return user;
	}

	
	
	

	
	


}
