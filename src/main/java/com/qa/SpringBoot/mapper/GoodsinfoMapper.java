package com.qa.SpringBoot.mapper;

import com.qa.SpringBoot.pojo.Goodsinfo;
import com.qa.SpringBoot.pojo.GoodsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized.Parameters;

public interface GoodsinfoMapper {
    int countByExample(GoodsinfoExample example);

    int deleteByExample(GoodsinfoExample example);

    int deleteByPrimaryKey(Integer gdid);

    int insert(Goodsinfo record);

    int insertSelective(Goodsinfo record);

    List<Goodsinfo> selectByExample(GoodsinfoExample example);

    Goodsinfo selectByPrimaryKey(Integer gdid);

    int updateByExampleSelective(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByExample(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByPrimaryKeySelective(Goodsinfo record);

    int updateByPrimaryKey(Goodsinfo record);
//-------------------------------------------------------------
       List<Goodsinfo>   likeBygdname(@Param("gdname")String gdname, @Param("stid") Integer stid);
       
     
       List<Goodsinfo>   selectlikebygtkeywords(String gtkeywords);
   
}