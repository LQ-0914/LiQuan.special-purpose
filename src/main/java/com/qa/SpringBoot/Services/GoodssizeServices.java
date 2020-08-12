package com.qa.SpringBoot.Services;

import java.util.List;

import com.qa.SpringBoot.pojo.Goodssize;

public interface GoodssizeServices {

	//查询尺寸
	List<Goodssize> selectSize();
	
}
