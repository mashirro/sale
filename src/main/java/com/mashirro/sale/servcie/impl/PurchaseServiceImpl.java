package com.mashirro.sale.servcie.impl;

import com.mashirro.sale.entity.Product;
import com.mashirro.sale.entity.PurchaseRecord;
import com.mashirro.sale.mapper.ProductMapper;
import com.mashirro.sale.mapper.PurchaseRecordMapper;
import com.mashirro.sale.servcie.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRecordMapper purchaseRecordMapper;

    @Autowired
    private ProductMapper productMapper;

    //启用Spring数据库事务机制
    @Transactional
    @Override
    public Boolean purchase(String userId, String productId, int quantity) {
        //开始时间
        long start = System.currentTimeMillis();
        //限定循环三次
        for (int i = 0; i < 3; i++) {
            //获取产品(线程旧值)
            Product product = productMapper.selectByPrimaryKey(productId);
            //比较库存和购买数量
            if (product.getStock() < quantity) {
                //库存不足
                return false;
            }
            //获取当前版本号
            Integer version = product.getVersion();
            //扣减库存，同时将当前版本号发送给后台进行比较
            int result = productMapper.decreaseProduct(quantity, productId, version);
            if (result == 0) {
                //如果更新数据失败，说明数据在多线程中被其他线程修改导致失败,则通过循环重入尝试购买产品
                continue;
            }
            //初始化购买记录
            PurchaseRecord purchaseRecord = initPurchaseRecord(userId, product, quantity);
            //插入购买记录
            purchaseRecordMapper.insertSelective(purchaseRecord);
            return true;
        }
        return false;
    }


    //初始化购买记录
    private PurchaseRecord initPurchaseRecord(String userId, Product product, int quantity) {
        PurchaseRecord pr = new PurchaseRecord();
        pr.setId(UUID.randomUUID().toString());
        pr.setNote("购买日志,时间: " + System.currentTimeMillis());
        pr.setProductId(product.getId());
        pr.setPrice(product.getPrice());
        pr.setQuantity(quantity);
        BigDecimal sumPrice = product.getPrice().multiply(new BigDecimal(quantity));
        pr.setSumprice(sumPrice);
        pr.setUserId(userId);
        pr.setCreateTime(new Date());
        return pr;
    }
}
