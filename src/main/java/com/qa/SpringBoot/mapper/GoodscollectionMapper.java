package com.qa.SpringBoot.mapper;

import com.qa.SpringBoot.pojo.GoodscollectionExample;
import com.qa.SpringBoot.pojo.GoodscollectionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodscollectionMapper {
    int countByExample(GoodscollectionExample example);

    int deleteByExample(GoodscollectionExample example);

    int deleteByPrimaryKey(GoodscollectionKey key);

    int insert(GoodscollectionKey record);

    int insertSelective(GoodscollectionKey record);

    List<GoodscollectionKey> selectByExample(GoodscollectionExample example);

    int updateByExampleSelective(@Param("record") GoodscollectionKey record, @Param("example") GoodscollectionExample example);

    int updateByExample(@Param("record") GoodscollectionKey record, @Param("example") GoodscollectionExample example);
}