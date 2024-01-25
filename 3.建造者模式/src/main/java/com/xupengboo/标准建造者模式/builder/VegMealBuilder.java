package com.xupengboo.标准建造者模式.builder;

/**
 * @author: xupengboo
 * @date: 2024/1/25 11:09
 * @description: 具体建造者类（素食）
 */
// 具体建造者类 - VegMealBuilder
public class VegMealBuilder extends AbstractMealBuilder {

    public void buildBurger() {
        meal.setBurger("Veg Burger");
    }

    public void buildDrink() {
        meal.setDrink("Coke");
    }

}
