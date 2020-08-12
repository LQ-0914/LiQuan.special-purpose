package com.qa.SpringBoot.Services;

import com.qa.SpringBoot.pojo.User;
import com.qa.SpringBoot.pojo.Userinfo;
public interface UserServices {
       
	   //登录
	   User selectUserBypwdAndName(String  username ,String  password);
	   
	   //uid查询用信息
	   
	   Userinfo   selectByUid(int userid);
	   
	   //注册
	   void insertUser(User u);
	   
	   //查询Userid
	   Integer   selectByUname(String username);   
	   
	   
	   //根据UID来查询user
	   User  selectByUID(int userid);   
	
}
