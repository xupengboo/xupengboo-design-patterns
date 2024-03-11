package com.xupengboo.strategy.impl;

import com.xupengboo.strategy.PaymentStrategy;

/**
 * @Author xupengboo
 * @Date 2024/3/11 14:07
 */
// 微信支付
public class WechatPayStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("使用微信支付：" + amount + " 元");
        // 这里可以添加微信支付的具体逻辑
    }

}
