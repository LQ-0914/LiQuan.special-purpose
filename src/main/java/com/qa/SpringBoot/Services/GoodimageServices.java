package com.qa.SpringBoot.Services;

import java.util.List;

import com.qa.SpringBoot.pojo.Goodsimage;

public interface GoodimageServices{

	//商品
	List<Goodsimage>  Getimgs(int count);
	
	//根据gdid来查询Goodsimage
	Goodsimage  selectByGdid(int gdid); 
	
	
}
