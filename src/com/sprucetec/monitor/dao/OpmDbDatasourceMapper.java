package com.sprucetec.monitor.dao;

import com.sprucetec.monitor.entity.OpmDbDatasource;
import com.sprucetec.monitor.entity.OpmDbDatasourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpmDbDatasourceMapper {
    int countByExample(OpmDbDatasourceExample example);

    int deleteByExample(OpmDbDatasourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OpmDbDatasource record);

    int insertSelective(OpmDbDatasource record);

    List<OpmDbDatasource> selectByExample(OpmDbDatasourceExample example);

    OpmDbDatasource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OpmDbDatasource record, @Param("example") OpmDbDatasourceExample example);

    int updateByExample(@Param("record") OpmDbDatasource record, @Param("example") OpmDbDatasourceExample example);

    int updateByPrimaryKeySelective(OpmDbDatasource record);

    int updateByPrimaryKey(OpmDbDatasource record);
}