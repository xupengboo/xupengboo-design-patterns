package com.xupengboo;

import com.xupengboo.strategy.PaymentStrategy;

/**
 * @Author xupengboo
 * @Date 2024/3/11 14:08
 */
// 支付上下文类 - 方便管理这些策略
public class PaymentContext {

    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }

}
