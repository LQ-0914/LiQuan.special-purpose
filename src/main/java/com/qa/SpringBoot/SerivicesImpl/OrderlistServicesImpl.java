package com.qa.SpringBoot.SerivicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SpringBoot.Services.OrderlistServices;
import com.qa.SpringBoot.mapper.OrderlistMapper;
import com.qa.SpringBoot.pojo.Orderlist;
import com.qa.SpringBoot.pojo.OrderlistExample;
import com.qa.SpringBoot.pojo.OrderlistExample.Criteria;

@Service
public class OrderlistServicesImpl implements 	OrderlistServices{
    @Autowired
    OrderlistMapper om;
	
	public void insertByOrderlist(Orderlist ol) {
		
		om.insert(ol);
	}

	
	public List<Orderlist> selectbyO(String ofid) {
		OrderlistExample  example=new OrderlistExample();
		Criteria cr= example.createCriteria();
		cr.andOfidEqualTo(ofid);
		List<Orderlist> list = om.selectByExample(example);
		
		
		return list;
	}

	
	  
	
	
	
	
	
	
	
}
