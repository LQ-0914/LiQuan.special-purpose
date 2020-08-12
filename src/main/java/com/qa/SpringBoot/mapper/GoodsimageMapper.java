package com.qa.SpringBoot.mapper;

import com.qa.SpringBoot.pojo.Goodsimage;
import com.qa.SpringBoot.pojo.GoodsimageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsimageMapper {
    int countByExample(GoodsimageExample example);

    int deleteByExample(GoodsimageExample example);

    int deleteByPrimaryKey(Integer gimgid);

    int insert(Goodsimage record);

    int insertSelective(Goodsimage record);

    List<Goodsimage> selectByExample(GoodsimageExample example);

    Goodsimage selectByPrimaryKey(Integer gimgid);

    int updateByExampleSelective(@Param("record") Goodsimage record, @Param("example") GoodsimageExample example);

    int updateByExample(@Param("record") Goodsimage record, @Param("example") GoodsimageExample example);

    int updateByPrimaryKeySelective(Goodsimage record);

    int updateByPrimaryKey(Goodsimage record);
//    ------------
    List<Goodsimage>  selectByC(@Param("count") int count); 
    
    Goodsimage  selectByGdid(int gdid);
}