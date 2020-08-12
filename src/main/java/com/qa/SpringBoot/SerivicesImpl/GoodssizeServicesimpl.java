package com.qa.SpringBoot.SerivicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.SpringBoot.Services.GoodssizeServices;
import com.qa.SpringBoot.mapper.GoodssizeMapper;
import com.qa.SpringBoot.pojo.Goodssize;
@Service
public class GoodssizeServicesimpl implements GoodssizeServices {
    @Autowired
    GoodssizeMapper gm;

	@Override
	public List<Goodssize> selectSize() {
		 List<Goodssize> list = gm.selectByExample(null);
		return list;
	}
	
	
	
	

}
