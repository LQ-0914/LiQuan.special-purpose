package com.qa.SpringBoot.Services;

import java.util.List;

import com.qa.SpringBoot.pojo.UserAddress;

public interface AddressServices {
    //查询
	List<UserAddress>  selectUseADD(int userid);
	
	//增加
	void insert(UserAddress uas);
	
	//修改回显
	public UserAddress selectByAid(int aid);
	
	
	
	//删除
	
	public  void  deleteByAid(int aid);
	
	
	//修改
	public  UserAddress   update(UserAddress u);
}



