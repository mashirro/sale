package com.mashirro.sale.mapper;


import com.mashirro.sale.entity.PurchaseRecord;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface PurchaseRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(PurchaseRecord record);

    int insertSelective(PurchaseRecord record);

    PurchaseRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PurchaseRecord record);

    int updateByPrimaryKey(PurchaseRecord record);

    //...............start.......................
}