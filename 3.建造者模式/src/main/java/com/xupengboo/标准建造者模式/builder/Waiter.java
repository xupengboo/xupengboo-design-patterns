package com.xupengboo.标准建造者模式.builder;

/**
 * @author: xupengboo
 * @date: 2024/1/25 11:12
 * @description: 指导者类
 */
// 指导者类 - Waiter
public class Waiter {

    public Meal construct(AbstractMealBuilder builder) {
        builder.buildDrink();
        builder.buildBurger();
        return builder.getResult();
    }

}
