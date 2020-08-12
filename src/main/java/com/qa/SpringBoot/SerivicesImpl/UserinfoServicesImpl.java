package com.qa.SpringBoot.SerivicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SpringBoot.Services.UserinfoServices;
import com.qa.SpringBoot.mapper.UserinfoMapper;
import com.qa.SpringBoot.pojo.Userinfo;
@Service
public class UserinfoServicesImpl implements UserinfoServices{
     
	@Autowired
	UserinfoMapper uim;
	
	
	public Userinfo Update(Userinfo u) {
          uim.updateByPrimaryKey(u);
          Integer userid = u.getUserid();
		  Userinfo userinfo = uim.selectByPrimaryKey(userid);
		
		return userinfo;
	}


	//注册
	public void insertUi(Userinfo ui) {
		
		uim.insert(ui);
	}

}
