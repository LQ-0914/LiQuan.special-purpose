package com.qa.SpringBoot.mapper;

import com.qa.SpringBoot.pojo.Usertype;
import com.qa.SpringBoot.pojo.UsertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsertypeMapper {
    int countByExample(UsertypeExample example);

    int deleteByExample(UsertypeExample example);

    int deleteByPrimaryKey(Integer utid);

    int insert(Usertype record);

    int insertSelective(Usertype record);

    List<Usertype> selectByExample(UsertypeExample example);

    Usertype selectByPrimaryKey(Integer utid);

    int updateByExampleSelective(@Param("record") Usertype record, @Param("example") UsertypeExample example);

    int updateByExample(@Param("record") Usertype record, @Param("example") UsertypeExample example);

    int updateByPrimaryKeySelective(Usertype record);

    int updateByPrimaryKey(Usertype record);
}