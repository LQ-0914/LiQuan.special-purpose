package com.qa.SpringBoot.SerivicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SpringBoot.Services.GoodsinfoServices;
import com.qa.SpringBoot.mapper.GoodsinfoMapper;
import com.qa.SpringBoot.mapper.GoodspriceMapper;
import com.qa.SpringBoot.mapper.StoreinfoMapper;
import com.qa.SpringBoot.pojo.Goodsinfo;
import com.qa.SpringBoot.pojo.GoodsinfoExample;
import com.qa.SpringBoot.pojo.Goodsprice;
import com.qa.SpringBoot.pojo.GoodspriceExample;
import com.qa.SpringBoot.pojo.GoodspriceExample.Criteria;
import com.qa.SpringBoot.pojo.Storeinfo;
@Service
public class GoodsinfoServicesimpl implements GoodsinfoServices {
    @Autowired
    GoodsinfoMapper gm;
	
	@Autowired
	StoreinfoMapper sm;
	
	@Autowired
	GoodspriceMapper gs;
	
	public Goodsinfo selectGbyId(int gdid) {
		Goodsinfo goodsinfo = gm.selectByPrimaryKey(gdid);
		return goodsinfo;
	}

	
	public Storeinfo selectSbyId(int stid) {
		Storeinfo storeinfo = sm.selectByPrimaryKey(stid);
		return storeinfo;
	}


	@Override
	public Goodsprice selectByUAndG(int utid, int gdid) {
		   Goodsprice goodsprice = gs.selectByUAndG(gdid, utid);
		return goodsprice;
	}


	@Override
	public List<Goodsprice> selectGByprice(double price) {
	
		List<Goodsprice>  lis= gs.selectByprice(price);
		 
		return lis;
	}


	/*模糊查询*/
public List<Goodsinfo> likeBygtkeywords(String gtkeywords) {
		
		List<Goodsinfo> Goodsinfo = gm.selectlikebygtkeywords(gtkeywords);
		
		return Goodsinfo;
	}


@Override
public List<Goodsinfo> queryall() {
	List<Goodsinfo> list = gm.selectByExample(null);
	return list;
}


@Override
public List<Goodsinfo> likeBYgdname(String gdname, Integer stid) {
	
	List<Goodsinfo> likeBygdname = gm.likeBygdname(gdname, stid);
	return likeBygdname;
}



//	根据价格去查询商品
	

	
	/*public List<Goodsprice> selectGBYgdid(int gdid) {
		GoodspriceExample  example=new GoodspriceExample();
		Criteria cr= example.createCriteria();
		cr.andGdidEqualTo(gdid);
		List<Goodsprice> se= gs.selectByExample(example);
		
		return se;
	}*/

}
