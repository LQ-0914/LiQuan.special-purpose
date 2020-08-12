package com.qa.SpringBoot.Services;

import com.qa.SpringBoot.pojo.Userinfo;

public interface UserinfoServices {

	
	//修改
	Userinfo Update(Userinfo u) ;
	
	//注册
	void insertUi(Userinfo ui);
	
	
}
