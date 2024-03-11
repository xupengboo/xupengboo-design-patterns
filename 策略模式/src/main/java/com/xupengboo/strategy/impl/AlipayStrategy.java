package com.xupengboo.strategy.impl;

import com.xupengboo.strategy.PaymentStrategy;

/**
 * @Author xupengboo
 * @Date 2024/3/11 14:05
 */
// 支付宝支付
public class AlipayStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("使用支付宝支付：" + amount + " 元");
        // 这里可以添加支付宝支付的具体逻辑
    }

}
