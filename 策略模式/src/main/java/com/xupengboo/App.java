package com.xupengboo;

import com.xupengboo.strategy.impl.AlipayStrategy;
import com.xupengboo.strategy.impl.CreditCardStrategy;
import com.xupengboo.strategy.impl.WechatPayStrategy;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        PaymentContext context = new PaymentContext(new CreditCardStrategy());
        context.executePayment(100.0); // 信用卡支付
        context.setStrategy(new AlipayStrategy());
        context.executePayment(100.0); // 支付宝支付
        context.setStrategy(new WechatPayStrategy());
        context.executePayment(100.0);// 微信支付
    }
}
