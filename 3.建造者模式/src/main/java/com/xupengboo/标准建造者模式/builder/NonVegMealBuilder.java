package com.xupengboo.标准建造者模式.builder;

/**
 * @author: xupengboo
 * @date: 2024/1/25 11:10
 * @description: 具体建造者类（非素食）
 */
// 具体建造者类 - NonVegMealBuilder
public class NonVegMealBuilder extends AbstractMealBuilder {

    public void buildBurger() {
        meal.setBurger("Chicken Burger");
    }

    public void buildDrink() {
        meal.setDrink("Pepsi");
    }

}
