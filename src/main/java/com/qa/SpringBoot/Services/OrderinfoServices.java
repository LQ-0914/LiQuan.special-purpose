package com.qa.SpringBoot.Services;

import java.util.List;

import com.qa.SpringBoot.pojo.Orderinfo;

public interface OrderinfoServices {

	//添加订单信息
	void     insterinfo(Orderinfo o );
	
	//根据userid来查询 Orderinfo
	
	List<Orderinfo> selectByuid(int  userid);
	
   
	//根据ofid 来修改付款状态
	
	void updateByOfid(String ofid ,Integer ofstate);
	
	
	//根据ofid 来查询Orderinfo
	Orderinfo selectOByO(String ofid);
	
	
	
}
