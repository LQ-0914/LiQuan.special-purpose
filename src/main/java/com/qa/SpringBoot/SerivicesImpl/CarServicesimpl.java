package com.qa.SpringBoot.SerivicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SpringBoot.Services.CarServices;
import com.qa.SpringBoot.mapper.CartMapper;
import com.qa.SpringBoot.mapper.GoodsinfoMapper;
import com.qa.SpringBoot.pojo.Cart;
import com.qa.SpringBoot.pojo.CartExample;
import com.qa.SpringBoot.pojo.CartExample.Criteria;



@Service
public class CarServicesimpl implements CarServices {
     @Autowired
     CartMapper cm;
     
     @Autowired
     GoodsinfoMapper gim;
	
	public List<Cart> selectBYUid(int userid) {
		CartExample example=new CartExample();
		Criteria c = example.createCriteria();
		c.andUseridEqualTo(userid);
		List<Cart> list = cm.selectByExample(example);
		
		return list;
	}

//增加	
	public void  insert(Cart c) {
		cm.insert(c);
		
	}


//删除
	public void delete(int ctid) {
		
		cm.deleteByPrimaryKey(ctid);
	}

	
	public List<Cart> selectbyGandUandG(int gsid, int userid, int gdid) {
		CartExample example=new CartExample();
		Criteria criteria = example.createCriteria();
		criteria.andGsidEqualTo(gsid).andUseridEqualTo(userid).andGdidEqualTo(gdid);
		List<Cart> list = cm.selectByExample(example);
		
		return list;
	}

	
	public void updateByCtid(int ctid, int gdcount) {
		
		cm.updateByctid(ctid, gdcount);
		
	}

//	删除
	public void deleteByUAGAG(int gsid, int userid, int gdid) {
		 
		CartExample example=new CartExample();
		Criteria c= example.createCriteria();
		c.andGsidEqualTo(gsid).andUseridEqualTo(userid).andGdidEqualTo(gdid);
		cm.deleteByExample(example);
	}

	//增加
	/*public List<Cart> insert(Cart c) {
		
		cm.insert(c);
		Integer ctid = c.getCtid();
		CartExample  example=new CartExample();
		Criteria  cr=example.createCriteria();
		cr.andCtidEqualTo(ctid);
		List<Cart> list = cm.selectByExample(example);
		
		return list;
	}*/

    

	

	
	
	
}
