package com.qa.SpringBoot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringBoot.Services.UserServices;
import com.qa.SpringBoot.Services.UserinfoServices;
import com.qa.SpringBoot.pojo.User;
import com.qa.SpringBoot.pojo.Userinfo;

@RequestMapping("/registerController")
@RestController
public class RegisterController {
     @Autowired
     UserServices us;
	
	 @Autowired
	 UserinfoServices uis;
	
	 @RequestMapping("/register")
	 public void registerByO(User u,Userinfo ui){
		 
		 ui.setLogdate(new Date());
		
		 String st= u.getSalt();
    	 int i = st.lastIndexOf("\\")+1;
    	 String sta = st.substring(i);
    	 u.setSalt(sta);
    	 u.setStatus(0);
    	 u.setUtid(1);
    	 System.out.println(u);
    	 
    	 us.insertUser(u);
    	 String username = u.getUsername();
    	 Integer id = us.selectByUname(username);
    	 
    	 ui.setUserid(id);
    	 uis.insertUi(ui);
    	 
		 
	 }
	
	
	
	
	
}
