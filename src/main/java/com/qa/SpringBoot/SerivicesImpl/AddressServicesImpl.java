package com.qa.SpringBoot.SerivicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SpringBoot.Services.AddressServices;
import com.qa.SpringBoot.mapper.UserAddressMapper;
import com.qa.SpringBoot.pojo.UserAddress;
import com.qa.SpringBoot.pojo.UserAddressExample;
import com.qa.SpringBoot.pojo.UserAddressExample.Criteria;
@Service
public class AddressServicesImpl implements AddressServices {
    
	 @Autowired
	 UserAddressMapper ua;

	@Override
	public List<UserAddress> selectUseADD(int userid) {
		UserAddressExample  example=new UserAddressExample();
		Criteria c= example.createCriteria();
		c.andUseridEqualTo(userid);
		List<UserAddress> list = ua.selectByExample(example);
		return list;
		
	}

	
	public void insert(UserAddress uas) {
		
		ua.insert(uas);
	}


	

	
	public void deleteByAid(int aid) {
		ua.deleteByPrimaryKey(aid);
		
	}


	@Override
	public UserAddress update(UserAddress u) {
		
		 ua.updateByPrimaryKey(u);
		 Integer aid = u.getAid();
		 UserAddress userAddress = ua.selectByPrimaryKey(aid);
		
		return userAddress;
	}


	@Override
	public UserAddress selectByAid(int aid) {

        UserAddress userAddress = ua.selectByPrimaryKey(aid);
		return userAddress;
	}


	


	
	

	
	
}
