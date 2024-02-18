package com.xupengboo.decorator;

import com.xupengboo.coffee.Coffee;

/**
 * @author: xupengboo
 * @date: 2024/2/18 15:50
 * @description: 咖啡抽象装饰类
 */
// 抽象装饰器
public abstract class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public double cost() {
        return coffee.cost();
    }
}
