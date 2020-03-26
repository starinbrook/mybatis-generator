package com.sprucetec.mms.locale.inventory.dao;

import com.sprucetec.mms.locale.inventory.entity.TMmsStockLossDetailOplog;
import com.sprucetec.mms.locale.inventory.entity.TMmsStockLossDetailOplogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMmsStockLossDetailOplogMapper {
    int countByExample(TMmsStockLossDetailOplogExample example);

    int deleteByExample(TMmsStockLossDetailOplogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TMmsStockLossDetailOplog record);

    int insertSelective(TMmsStockLossDetailOplog record);

    List<TMmsStockLossDetailOplog> selectByExample(TMmsStockLossDetailOplogExample example);

    TMmsStockLossDetailOplog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TMmsStockLossDetailOplog record, @Param("example") TMmsStockLossDetailOplogExample example);

    int updateByExample(@Param("record") TMmsStockLossDetailOplog record, @Param("example") TMmsStockLossDetailOplogExample example);

    int updateByPrimaryKeySelective(TMmsStockLossDetailOplog record);

    int updateByPrimaryKey(TMmsStockLossDetailOplog record);
}