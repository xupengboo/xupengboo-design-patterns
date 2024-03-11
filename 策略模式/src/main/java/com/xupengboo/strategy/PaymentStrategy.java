package com.xupengboo.strategy;

/**
 * @Author xupengboo
 * @Date 2024/3/11 14:03
 * @description:
 *   假设有一个在线购物系统，用户可以选择不同的支付方式，如信用卡支付、支付宝支付、微信支付等。
 *   每一种支付方式都是一种支付策略，它包含了与该支付方式相关的逻辑。这时就可以使用策略模式来设计系统。
 */
// 策略接口
public interface PaymentStrategy {

    void pay(double amount);

}
