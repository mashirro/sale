package com.mashirro.sale.mapper;


import com.mashirro.sale.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface ProductMapper {
    int deleteByPrimaryKey(String id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    //...............start.......................

    /**
     * 减库存
     */
    int decreaseProduct(@Param("quantity") int quantity, @Param("id") String id, @Param("version") int version);
}