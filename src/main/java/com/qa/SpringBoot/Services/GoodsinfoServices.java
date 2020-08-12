package com.qa.SpringBoot.Services;

import java.util.List;

import com.qa.SpringBoot.pojo.Goodsinfo;
import com.qa.SpringBoot.pojo.Goodsprice;
import com.qa.SpringBoot.pojo.Storeinfo;

public interface GoodsinfoServices {

	//根据Gdid
	
	Goodsinfo  selectGbyId(int gdid);
	
	
	
	//根据stid
	
	Storeinfo  selectSbyId(int stid);
	
	
	//根据utid 和 Gdid 来查询Goodsprice
	Goodsprice  selectByUAndG(int utid,int gdid);  
	
	
	//模糊查询商品
	List<Goodsinfo>   likeBYgdname(String gdname ,Integer  stid);
	
	
	//根据Gdid来搜索价格
	/*List<Goodsprice>    selectGBYgdid(int gdid);*/
	
	
	//根据价格查询gdid
	 List<Goodsprice>  selectGByprice(double price);
	 
	 //模糊查询根据gtkeywords
	 List<Goodsinfo>   likeBygtkeywords(String gtkeywords);
	 
	 //无条件查询goodsinfo
	 List<Goodsinfo>  queryall();
	
}
