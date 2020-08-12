package com.qa.SpringBoot.Services;

import com.qa.SpringBoot.pojo.Storeinfo;

public interface StoreinfoServices {

	//根据stid来查询Storeinfo
	
	Storeinfo  selectByStid(int Stid);
}
