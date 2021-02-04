package com.mashirro.sale.entity;

import java.math.BigDecimal;

/**
 * 产品信息表
 * @date   2021/02/02
 */
public class Product {
    /**
     * 主键
     */
    private String id;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 库存
     */
    private Integer stock;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 版本号
     */
    private Integer version;

    /**
     * 备注
     */
    private String note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}