package com.xupengboo.strategy.impl;

import com.xupengboo.strategy.PaymentStrategy;

/**
 * @Author xupengboo
 * @Date 2024/3/11 14:04
 */
// 信用卡支付
public class CreditCardStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("使用信用卡支付：" + amount + " 元");
        // 这里可以添加信用卡支付的具体逻辑
    }

}
