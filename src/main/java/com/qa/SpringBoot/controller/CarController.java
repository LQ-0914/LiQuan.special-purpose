package com.qa.SpringBoot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringBoot.Services.CarServices;

import com.qa.SpringBoot.Services.GoodimageServices;
import com.qa.SpringBoot.Services.GoodsinfoServices;
import com.qa.SpringBoot.Services.StoreinfoServices;
import com.qa.SpringBoot.Services.UserServices;
import com.qa.SpringBoot.pojo.Cart;
import com.qa.SpringBoot.pojo.Goodsimage;
import com.qa.SpringBoot.pojo.Goodsinfo;
import com.qa.SpringBoot.pojo.Goodsprice;
import com.qa.SpringBoot.pojo.Storeinfo;
import com.qa.SpringBoot.pojo.User;


@RequestMapping("/carController")
@RestController
public class CarController {

	@Autowired
	CarServices cs;
	
	@Autowired
	GoodsinfoServices gis;
	
	@Autowired
	GoodimageServices  gas;
	
	@Autowired
	StoreinfoServices  sis;
	
	@Autowired
	UserServices us;
	
	@RequestMapping("/querycar")
	public Map<String, Object>  selectGshoping(Integer userid){
		Map<String, Object> map=new HashMap<String, Object>();
		  System.out.println(userid);
		  List<Cart> list= cs.selectBYUid(userid);
		  List<Goodsinfo> goodsinfo=new ArrayList<Goodsinfo>();
		  List<String> imgurl=new ArrayList<>();
		  Set<Integer>  stid=new HashSet<>();
		  List<String>  stname=new ArrayList<>();
		  List<Double>  price1=new ArrayList<>();
		  List<Double>  price0=new ArrayList<>();
		  List<Integer> count=new ArrayList<>();
		  List<Integer> size=new ArrayList<>();
		  List<Integer> ctid=new ArrayList<>();
		  for (Cart cart : list) {
			 //商品详情
			 Integer gdid = cart.getGdid();
			 Goodsinfo go= gis.selectGbyId(gdid);
			 goodsinfo.add(go);
			 //商品图片路径
			 Goodsimage gs= gas.selectByGdid(gdid);
			 String img= gs.getGimgurl();
			 imgurl.add(img);
			 //店铺stid 
			 Integer sid= go.getStid();
			 stid.add(sid);
			
			//获取原价 
			  Goodsprice gp= gis.selectByUAndG(1, gdid);
			 Double price = gp.getPrice();
			 price0.add(price);
			 
			 //获取售价
			 Integer id= cart.getUserid();
			 User user = us.selectByUID(id);
			 Integer utid = user.getUtid();
			 Goodsprice gss= gis.selectByUAndG(utid, gdid);
			 Double price2= gss.getPrice();
			 price1.add(price2);
			 
			 //数量   码数    
			 count.add(cart.getGdcount());
			 size.add(cart.getGsid());
			 ctid.add(cart.getCtid());
			 
		}
		  //店铺stname
			 for (Integer integer : stid) {
				 Storeinfo storeinfo = sis.selectByStid(integer);
				 stname.add(storeinfo.getStname());
			}
		  
		  map.put("goodsInfo", goodsinfo);
		  map.put("storename", stname);
		  map.put("storeid",stid );
		  map.put("img", imgurl);
		  map.put("price1", price0);
		  map.put("price", price1);
		  map.put("count", count);
		  map.put("size", size);
		  map.put("ctid", ctid);
		return map;
	}
	
//	添加
	@RequestMapping("/addCar")
	public List<Cart>  insert(Cart c){
		Integer gsid = c.getGsid();
		Integer userid = c.getUserid();
	    Integer gdid = c.getGdid();	
	    
	    List<Cart> list = cs.selectbyGandUandG(gsid, userid, gdid);
	    if(list.size()>0){
	       for (Cart cart : list){
			Integer ctid = cart.getCtid();
			Integer gdcount = cart.getGdcount();
			gdcount=gdcount+1;
			cs.updateByCtid(ctid, gdcount);
		}
	       
	    }else{
	    	cs.insert(c);
	    }
	   List<Cart> list3= cs.selectBYUid(userid); 
	   return list3;
	}
	
// 删除
	
	@RequestMapping("/delCar")
	public void  delete(Integer ctid){
		
		cs.delete(ctid);
	}
	
	
	
}
