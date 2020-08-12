package com.qa.SpringBoot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringBoot.Services.GoodimageServices;
import com.qa.SpringBoot.Services.GoodsinfoServices;
import com.qa.SpringBoot.Services.OrderinfoServices;
import com.qa.SpringBoot.Services.OrderlistServices;
import com.qa.SpringBoot.Services.StoreinfoServices;
import com.qa.SpringBoot.pojo.Goodsimage;
import com.qa.SpringBoot.pojo.Goodsinfo;
import com.qa.SpringBoot.pojo.Goodsprice;
import com.qa.SpringBoot.pojo.Orderinfo;
import com.qa.SpringBoot.pojo.Orderlist;
import com.qa.SpringBoot.pojo.Storeinfo;


@RestController
@RequestMapping("/orderController")
public class OrderController {

	@Autowired
	OrderinfoServices os;
	
	@Autowired
	OrderlistServices ol;
	
	@Autowired
	GoodimageServices  gs;
	
	@Autowired
	GoodsinfoServices gis;
	
	@Autowired
	StoreinfoServices  sis;
	
//	不完善  不完美
	@RequestMapping("/addorderinfo")
	public void getOrdersinfo(Orderinfo info){
		
		os.insterinfo(info);
	}
	
	
	@RequestMapping("/addorderlist")
	public  void   insertOrderlist(Orderlist li){
		
		
	    long round = Math.round(Math.random()*10000);	
		String string = String.valueOf(round);
		
		li.setOlid(string+"LQ");
		ol.insertByOrderlist(li);
		
		
	}
	

	
	
	@RequestMapping("/info")
	public Map<String, Object>  getinfo(Integer userid){
		
		List<Object> li=new ArrayList<Object>();
		List<Object> lii=new ArrayList<Object>();
		List<Object> img=new ArrayList<Object>();
		List<Object> sinfo=new ArrayList<Object>();
		List<Object> gsifo=new ArrayList<Object>();
		List<Object> gsprice=new ArrayList<Object>();
		Map<String, Object>  map=new HashMap<String, Object>();
		List<Orderinfo> orderinfo= os.selectByuid(userid);
		for (Orderinfo orinfo: orderinfo) {
			
			String ofid = orinfo.getOfid();
			
			
			List<Orderlist> selectbyO = ol.selectbyO(ofid);
			for (Orderlist olist: selectbyO) {
				   
				
				   li.add(olist);
				   Integer gdid = olist.getGdid();
				   Goodsimage gsimgs= gs.selectByGdid(gdid);
				   
				   Goodsinfo goodsinfo= gis.selectGbyId(gdid);
				   gsifo.add(goodsinfo);
				   Integer stid = goodsinfo.getStid();
				   Storeinfo storeinfo = sis.selectByStid(stid);
				   sinfo.add(storeinfo);
				  
				   String gimgurl = gsimgs.getGimgurl();
				   img.add(gimgurl);
				   
				   Goodsprice goodsprice= gis.selectByUAndG(1, gdid);
				   Double price = goodsprice.getPrice();
				   gsprice.add(price);
				   
			}
			
			lii.add(orinfo);
		}
		
		map.put("olist", li);
		map.put("orinfo", lii);
		map.put("imgurl", img);
		map.put("storeinfo", sinfo);
		map.put("goodsinfo", gsifo);
		map.put("gsprice", gsprice);
		return  map;
	}
	
	
}
