package com.qa.SpringBoot.Services;

import java.util.List;

import com.qa.SpringBoot.pojo.Orderlist;

public interface OrderlistServices {

	//添加订单详情
	void  insertByOrderlist(Orderlist ol);
	
	
	
	//根据ofid来查询订单信息
	
	List<Orderlist> selectbyO(String ofid);
	

	
	
}
