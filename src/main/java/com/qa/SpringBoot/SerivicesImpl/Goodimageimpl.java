package com.qa.SpringBoot.SerivicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.SpringBoot.Services.GoodimageServices;
import com.qa.SpringBoot.mapper.GoodsimageMapper;
import com.qa.SpringBoot.pojo.Goodsimage;
@Service
public class Goodimageimpl implements GoodimageServices {

	@Autowired
	GoodsimageMapper gm;

	@Override
	public List<Goodsimage> Getimgs(int count) {
        List<Goodsimage> c = gm.selectByC(count);
		return c;
	}

	@Override
	public Goodsimage selectByGdid(int gdid) {
		 Goodsimage Goodsimage = gm.selectByGdid(gdid);
		return Goodsimage;
	}

	
	
	
	


}
