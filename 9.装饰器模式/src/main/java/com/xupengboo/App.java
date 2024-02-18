package com.xupengboo;

import com.xupengboo.coffee.Coffee;
import com.xupengboo.coffee.impl.Espresso;
import com.xupengboo.decorator.decorator.MilkDecorator;
import com.xupengboo.decorator.decorator.SugarDecorator;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        Coffee coffee = new Espresso();
        // 加奶
        coffee = new MilkDecorator(coffee);
        // 加糖
        coffee = new SugarDecorator(coffee);
        // 最后消费：
        System.out.println("Cost：" + coffee.cost());
    }

}
