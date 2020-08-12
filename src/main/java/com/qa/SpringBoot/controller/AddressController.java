package com.qa.SpringBoot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringBoot.Services.AddressServices;
import com.qa.SpringBoot.pojo.UserAddress;

@RequestMapping("/addressController")
@RestController
public class AddressController {
      @Autowired
      AddressServices AS;
	 
	  @RequestMapping("/address")
	  public  Map<String, Object>  query(Integer userid){
		  List<UserAddress> list = AS.selectUseADD(userid);
		  Map<String,Object > map=new HashMap<String, Object>();
		  
		  map.put("list", list);
		  
		  return map;
	  }
//	添加  
	  @RequestMapping("/insert")
	  public  void  insertUserAddress(UserAddress uas){
		  
		  AS.insert(uas);
		  
	  }
// 修改回显 
	 @RequestMapping("/add")
	  public UserAddress   update(Integer aid){
		 
		   UserAddress userAddress = AS.selectByAid(aid);
		  return userAddress;
		  
	  }
//	  删除
	 @RequestMapping("/delete") 
	 public  void  deleteByAid(Integer aid){
		 
		 
		 AS.deleteByAid(aid);
	 }

	 
// 修改
	 @RequestMapping("/update")
	 public void upd(UserAddress u){
		 System.out.println(u);
		  UserAddress  userAddress= AS.update(u);
		
	}
	  
}
