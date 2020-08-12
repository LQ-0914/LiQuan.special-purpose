package com.qa.SpringBoot.mapper;

import com.qa.SpringBoot.pojo.Goodsprice;
import com.qa.SpringBoot.pojo.GoodspriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodspriceMapper {
    int countByExample(GoodspriceExample example);

    int deleteByExample(GoodspriceExample example);

    int deleteByPrimaryKey(Integer gpid);

    int insert(Goodsprice record);

    int insertSelective(Goodsprice record);

    List<Goodsprice> selectByExample(GoodspriceExample example);

    Goodsprice selectByPrimaryKey(Integer gpid);

    int updateByExampleSelective(@Param("record") Goodsprice record, @Param("example") GoodspriceExample example);

    int updateByExample(@Param("record") Goodsprice record, @Param("example") GoodspriceExample example);

    int updateByPrimaryKeySelective(Goodsprice record);

    int updateByPrimaryKey(Goodsprice record);
// ---------------------------------------------------   
    Goodsprice  selectByUAndG(@Param("gdid") int gdid,@Param("utid") int utid);
    
//  根据最大最小价格查询
    
    Goodsprice   selectBymixandmax(@Param("min") double min ,@Param("max") double max);
    
    List<Goodsprice>   selectByprice(double   price);
    
}