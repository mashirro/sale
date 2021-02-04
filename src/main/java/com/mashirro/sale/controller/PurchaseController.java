package com.mashirro.sale.controller;


import com.mashirro.sale.entity.Result;
import com.mashirro.sale.servcie.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping("/purchase")
    public Result purchase(String userId, String productId, Integer quantity) {
        Boolean success = purchaseService.purchase(userId, productId, quantity);
        if (success) {
            return Result.success("抢购成功!", null);
        } else {
            return Result.error("抢购失败!");
        }
    }

}
