package com.qa.SpringBoot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringBoot.Services.GoodimageServices;
import com.qa.SpringBoot.Services.GoodsinfoServices;
import com.qa.SpringBoot.Services.GoodssizeServices;
import com.qa.SpringBoot.pojo.Goodsimage;
import com.qa.SpringBoot.pojo.Goodsinfo;
import com.qa.SpringBoot.pojo.Goodsprice;
import com.qa.SpringBoot.pojo.Goodssize;
import com.qa.SpringBoot.pojo.Storeinfo;

@RequestMapping("/goodsinfoController")
@RestController
public class GoodsinfoController {
      

	@Autowired
      GoodsinfoServices gs;
      
      @Autowired
      GoodimageServices gis;
      
   
	
	 @RequestMapping("/goodsinfo")
	 public Map<String, Object> getgoodsinfo(Integer gdid ,Integer utid){
		 System.out.println(utid);
		 
		 Map<String, Object> map=new HashMap<String, Object>();
		 Goodsinfo goodsinfo = gs.selectGbyId(gdid);
		 
		 Integer stid = goodsinfo.getStid();
		 
		 Storeinfo storeinfo = gs.selectSbyId(stid);
		 Goodsprice goodsprice = gs.selectByUAndG(utid, gdid);
		 Goodsprice goodsprice2 = gs.selectByUAndG(1, gdid);
		 
		 map.put("price", goodsprice.getPrice());
		 map.put("price2", goodsprice2.getPrice()); 
		 map.put("goodsinfo", goodsinfo);
		 map.put("storeinfo", storeinfo);
		 
		 return map;
	 }
	
	 @Autowired
	 GoodssizeServices gss;
	
	 //尺寸
	 @RequestMapping("/size")
	 public  Map<String, Object>  getgoodssize(){
		  List<Goodssize> list = gss.selectSize();
		  Map<String, Object> map=new HashMap<String, Object>();
		   map.put("size", list);
		 
		 return map;
	 }
	
	
	
	
	@RequestMapping("/search")
	public  Map<String, Object>  search(@RequestParam(value="searchName",required=false) String searchName,
			                            @RequestParam(value="min",required=false) Integer min,
			                            @RequestParam(value="max",required=false) Integer max,
			                            @RequestParam(value="utid",required=false) Integer utid,
			                            @RequestParam(value="word[]",required=false) ArrayList<String> word,
			                            @RequestParam(value="stid",required=false) Integer stid){
		Map<String, Object> map=new HashMap<String, Object>();
		
		
		
		if(max==null){max=0;}
		if(min==null){min=0;}
		if(searchName==null){searchName="";}
		if(word==null){word=new ArrayList<>();}
		Set<String> liwords=new HashSet();
		List<Goodsinfo> info=new ArrayList<Goodsinfo>();
		List<Goodsimage> image=new ArrayList<Goodsimage>();
		List<Double>  pri1=new ArrayList<>();
		List<Double>  pri0=new ArrayList<>();
		
//		模糊查询加载所有数据
		
		
		
		List<Goodsinfo> ginfo=gs.likeBYgdname(searchName,stid);
		
		
		
		
		for (Goodsinfo goif : ginfo) {
//			获取关键字
			String str= goif.getGtkeywords();
//					分类
			String[] string=str.split(" ");
			List<String> stra= new ArrayList<>();
			for (String string2 : string) {
				stra.add(string2);
			}
			
//          获取商品id
			Integer gdid = goif.getGdid();
			
			
//			获取原价
			Goodsprice prices1= gs.selectByUAndG(1, gdid);
			Double price = prices1.getPrice();
//			符合价格
			if(price>min&&price<max||max==0){
				
//				符合关键字
				if(word.size()==0||stra.containsAll(word)){
					
//					添加	Goodsinfo
					info.add(goif);
					
//				    根据gdid来获取goodsimgs		
					
					Goodsimage img= gis.selectByGdid(gdid);
					image.add(img);
					
					/*	根据	utid and 	gdid 来获取价格
					售价*/
				
					Goodsprice prices0= gs.selectByUAndG(utid, gdid);
					Double price2 = prices0.getPrice();
					pri0.add(price2);					
					
					pri1.add(price);
					
					liwords.addAll(stra);
					
					
				}
				
				
				
				
				
				
			}
			
			
			
		}
		
		
		
//根据 价格区间扫描数据
		map.put("words", liwords);
		map.put("goodsinfo", info);
		map.put("goodsimgs", image);
		map.put("prices1", pri1);
		map.put("prices", pri0);
		
		/*铵价格去分类*/
		/*if(min!=null&&max!=null){
		   Map<String, Object> ma = this.seletinfobyjiage(min, max, searchName, utid);
		   return ma;
		}*/
		
		/*按关键字分类*/
		/*if(word!=null){
			
			   Map<String, Object> m= this.seletinfobyguanjianzi(searchName, word, utid);
			   System.out.println(m.size());
			   return m;
			   
			}*/
		
		return map;
		
	}
	
	
	
	/*铵价格去分类*/	
/*public   Map<String , Object>  seletinfobyjiage(Integer min,Integer max,String searchName,Integer utid){
		
		Map<String, Object> map=new HashMap<String, Object>();
		Set<String> liwo=new HashSet<>();
		List<Goodsinfo> in=new ArrayList<Goodsinfo>();
		List<Goodsimage> im=new ArrayList<Goodsimage>();
		List<Double>  pr1=new ArrayList<>();
		List<Double>  pr0=new ArrayList<>();
		
		查询Goodsinfo
		List<Goodsinfo> ginfo= gs.likeBYgdname(searchName);
		for (Goodsinfo goodsinfo : ginfo) {
			
			  Integer gdid = goodsinfo.getGdid();
			  Goodsprice prices1= gs.selectByUAndG(1, gdid);
			  Double price = prices1.getPrice(); 
			  if(price>min&&price<max){
				 
                  标价				  
				  pr1.add(price);
				  
			   来获取商品信息集合
				  Goodsinfo good= gs.selectGbyId(gdid);
				  in.add(good);
				  
		      商品图片
				  Goodsimage imgs= gis.selectByGdid(gdid);
			      im.add(imgs);
					 
					  
					//words 分类	  
					  for (Goodsinfo goif : in) {
							String str= goif.getGtkeywords();
							String [] string=str.split(" ");
							for (String stri : string) {
								liwo.add(stri);
						}
					  
					售价  
					Goodsprice prices0= gs.selectByUAndG(utid, gdid);
					Double price2 = prices0.getPrice();
				    pr0.add(price2); 
				}
				  
			
			
			
       }
  }
		
		map.put("words", liwo);
		map.put("goodsinfo", in);
		map.put("goodsimgs", im);
		map.put("prices1", pr1);
		map.put("prices", pr0);
		return map;	
		
}
*/	
	

/*按照关键字分类*/

/*public   Map<String, Object>  seletinfobyguanjianzi(String searchName,String word,Integer utid){
	    Map<String, Object>  map=new HashMap<>();
	     
	    Set<String> lw=new HashSet<>();
		List<Goodsinfo> ifo=new ArrayList<Goodsinfo>();
		List<Goodsimage> imgs=new ArrayList<Goodsimage>();
		List<Double>  p0=new ArrayList<>();
		List<Double>  p1=new ArrayList<>();
	     
	    
	     List<Goodsinfo> list = gs.likeBygtkeywords(word);
	     
	     for (Goodsinfo goodsinfo : list) {
	    	 
	    	商品信息 
			ifo.add(goodsinfo);
			
			商品图片
			Integer gdid = goodsinfo.getGdid();
			Goodsimage img= gis.selectByGdid(gdid);
			imgs.add(img);
			
			
			商品售价
			Integer gdid2 = goodsinfo.getGdid();
			Goodsprice pric= gs.selectByUAndG(utid, gdid2);
			Double price2 = pric.getPrice();
			p0.add(price2);
			商品标价
			Goodsprice price= gs.selectByUAndG(1, gdid2);
			Double price3 = price.getPrice();
			p1.add(price3);
			
			分类
			String str= goodsinfo.getGtkeywords();
			String [] string=str.split(" ");
			for (String stri : string) {
				System.out.println(word+123);
				if(word==stri){
					break;
				}else {
					lw.add(stri);
				
				}
				
			}
			
		}  
	
	     
		
	        map.put("words", lw);
			map.put("goodsinfo", ifo);
			map.put("goodsimgs", imgs);
			map.put("prices1", p1);
			map.put("prices", p0);
			
	     
           
	     return map;
}


*/


	
}
