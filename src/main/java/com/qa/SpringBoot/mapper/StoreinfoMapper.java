package com.qa.SpringBoot.mapper;

import com.qa.SpringBoot.pojo.Storeinfo;
import com.qa.SpringBoot.pojo.StoreinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreinfoMapper {
    int countByExample(StoreinfoExample example);

    int deleteByExample(StoreinfoExample example);

    int deleteByPrimaryKey(Integer stid);

    int insert(Storeinfo record);

    int insertSelective(Storeinfo record);

    List<Storeinfo> selectByExample(StoreinfoExample example);

    Storeinfo selectByPrimaryKey(Integer stid);

    int updateByExampleSelective(@Param("record") Storeinfo record, @Param("example") StoreinfoExample example);

    int updateByExample(@Param("record") Storeinfo record, @Param("example") StoreinfoExample example);

    int updateByPrimaryKeySelective(Storeinfo record);

    int updateByPrimaryKey(Storeinfo record);
//    -----------------
    
    Storeinfo   selectByStid(int Stid);
    
    
}