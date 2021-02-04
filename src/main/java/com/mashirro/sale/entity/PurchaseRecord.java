package com.mashirro.sale.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 购买信息表
 */
public class PurchaseRecord {
    /**
     * 主键
     */
    private String id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 产品id
     */
    private String productId;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 总价
     */
    private BigDecimal sumprice;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建时间
     */
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSumprice() {
        return sumprice;
    }

    public void setSumprice(BigDecimal sumprice) {
        this.sumprice = sumprice;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}