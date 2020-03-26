package com.kkb.mybatis.phase03.mapper;

import com.kkb.mybatis.phase03.po.TGoods;
import com.kkb.mybatis.phase03.po.TGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TGoodsMapper {
    int countByExample(TGoodsExample example);

    int deleteByExample(TGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TGoods record);

    int insertSelective(TGoods record);

    List<TGoods> selectByExample(TGoodsExample example);

    TGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TGoods record, @Param("example") TGoodsExample example);

    int updateByExample(@Param("record") TGoods record, @Param("example") TGoodsExample example);

    int updateByPrimaryKeySelective(TGoods record);

    int updateByPrimaryKey(TGoods record);
}