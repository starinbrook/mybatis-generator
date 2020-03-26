package com.sprucetec.mms.center.master.dao;

import com.sprucetec.mms.center.master.entity.TMmsDeviceFixApplySpareParts;
import com.sprucetec.mms.center.master.entity.TMmsDeviceFixApplySparePartsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TMmsDeviceFixApplySparePartsMapper {
    int countByExample(TMmsDeviceFixApplySparePartsExample example);

    int deleteByExample(TMmsDeviceFixApplySparePartsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TMmsDeviceFixApplySpareParts record);

    int insertSelective(TMmsDeviceFixApplySpareParts record);

    List<TMmsDeviceFixApplySpareParts> selectByExample(TMmsDeviceFixApplySparePartsExample example);

    TMmsDeviceFixApplySpareParts selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TMmsDeviceFixApplySpareParts record, @Param("example") TMmsDeviceFixApplySparePartsExample example);

    int updateByExample(@Param("record") TMmsDeviceFixApplySpareParts record, @Param("example") TMmsDeviceFixApplySparePartsExample example);

    int updateByPrimaryKeySelective(TMmsDeviceFixApplySpareParts record);

    int updateByPrimaryKey(TMmsDeviceFixApplySpareParts record);
}