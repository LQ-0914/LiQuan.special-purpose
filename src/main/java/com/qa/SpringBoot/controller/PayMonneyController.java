package com.qa.SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qa.SpringBoot.Services.CarServices;
import com.qa.SpringBoot.Services.OrderinfoServices;
import com.qa.SpringBoot.Services.OrderlistServices;
import com.qa.SpringBoot.pojo.Orderinfo;
import com.qa.SpringBoot.pojo.Orderlist;

@RequestMapping("/payMonneyController")
@Controller
public class PayMonneyController {
    
	@Autowired
	OrderinfoServices ois;
	
	@Autowired
	OrderlistServices ols;
	
	@Autowired
	CarServices cs;
	
	
	@RequestMapping("/su")
    public   String   SuccessOrFailure(String  out_trade_no){
		
	      ois.updateByOfid(out_trade_no, 0);
	      
	      Orderinfo orderinfo = ois.selectOByO(out_trade_no);
	      Integer userid = orderinfo.getUserid();
	      
	      
	      List<Orderlist> o= ols.selectbyO(out_trade_no);
	      for (Orderlist ord: o){
			
	    	   Integer gdid = ord.getGdid();
	    	   Integer gsid = ord.getGsid();
	    	  
	    	   cs.deleteByUAGAG(gsid, userid, gdid);
		  }
		   
   
		return   "redirect:http://localhost:8080/#/myorders";
	}
	
	
	
	
	
	
	
	
	
	
}
