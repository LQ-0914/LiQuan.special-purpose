package com.qa.SpringBoot.Services;

import java.util.List;

import com.qa.SpringBoot.pojo.Cart;


public interface CarServices {

	//根据userID来查询用户的购物车
	List<Cart>  selectBYUid(int userid);
	
	
	//增加数据
	void  insert(Cart c);
    
    
    //删除 根据ctid
	void  delete(int ctid);
    
    
    
    //根据 gsid userid gdid来查询Cart
    
    List<Cart>  selectbyGandUandG(int gsid, int userid , int  gdid);
    
    
    //根据ctid修改gdcount
    void  updateByCtid(int ctid, int gdcount);
    
    
    //根据userid  gsid  gdid来删除
    void   deleteByUAGAG(int gsid, int userid , int  gdid);
    
}
