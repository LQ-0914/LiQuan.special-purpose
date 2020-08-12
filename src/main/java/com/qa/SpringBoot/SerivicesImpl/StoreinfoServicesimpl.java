package com.qa.SpringBoot.SerivicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SpringBoot.Services.StoreinfoServices;
import com.qa.SpringBoot.mapper.StoreinfoMapper;
import com.qa.SpringBoot.pojo.Storeinfo;
@Service
public class StoreinfoServicesimpl  implements StoreinfoServices{
    @Autowired
    StoreinfoMapper sm;
	
	public Storeinfo selectByStid(int Stid) {
		Storeinfo storeinfo = sm.selectByStid(Stid);
		return storeinfo;
	}

}
