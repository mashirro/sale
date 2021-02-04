package com.mashirro.sale.servcie;

public interface PurchaseService {


    /**
     * 处理购买业务
     *
     * @param userId    用户id
     * @param productId 产品id
     * @param quantity  购买数量
     * @return 成功or失败
     */
    Boolean purchase(String userId, String productId, int quantity);
}
