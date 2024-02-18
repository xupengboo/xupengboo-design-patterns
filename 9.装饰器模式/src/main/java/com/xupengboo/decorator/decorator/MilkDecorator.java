package com.xupengboo.decorator.decorator;

import com.xupengboo.coffee.Coffee;
import com.xupengboo.decorator.CoffeeDecorator;

/**
 * @author: xupengboo
 * @date: 2024/2/18 15:52
 * @description: 加奶装饰类
 */
// 具体实现器
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

}
