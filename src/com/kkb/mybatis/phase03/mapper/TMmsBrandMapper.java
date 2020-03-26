package com.kkb.mybatis.phase03.mapper;

import com.kkb.mybatis.phase03.po.TMmsBrand;
import com.kkb.mybatis.phase03.po.TMmsBrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMmsBrandMapper {
    int countByExample(TMmsBrandExample example);

    int deleteByExample(TMmsBrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TMmsBrand record);

    int insertSelective(TMmsBrand record);

    List<TMmsBrand> selectByExample(TMmsBrandExample example);

    TMmsBrand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TMmsBrand record, @Param("example") TMmsBrandExample example);

    int updateByExample(@Param("record") TMmsBrand record, @Param("example") TMmsBrandExample example);

    int updateByPrimaryKeySelective(TMmsBrand record);

    int updateByPrimaryKey(TMmsBrand record);
}