package com.qa.SpringBoot.SerivicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SpringBoot.Services.OrderinfoServices;
import com.qa.SpringBoot.mapper.OrderinfoMapper;
import com.qa.SpringBoot.pojo.Orderinfo;
import com.qa.SpringBoot.pojo.OrderinfoExample;
import com.qa.SpringBoot.pojo.OrderinfoExample.Criteria;

@Service
public class OrderinfoServicesImpl  implements OrderinfoServices{

	 @Autowired
	 OrderinfoMapper om;

	
	public void insterinfo(Orderinfo o) {
		
		om.insert(o);
	}

	//查询Orderinfo
	
	public List<Orderinfo> selectByuid(int userid) {
		OrderinfoExample  example=new OrderinfoExample();
		Criteria cr= example.createCriteria();
		cr.andUseridEqualTo(userid);
		List<Orderinfo> list = om.selectByExample(example);
		return list;
	}

	//根据ofid 来修改付款状态
	public void updateByOfid(String ofid, Integer ofstate) {
		
		om.updateOfstatebByofid(ofstate, ofid);
	}

	@Override
	public Orderinfo selectOByO(String ofid) {
		
		Orderinfo orderinfo= om.selectByPrimaryKey(ofid);
		
		return orderinfo;
	}

	
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
