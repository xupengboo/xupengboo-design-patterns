package com.xupengboo.标准建造者模式.builder;

/**
 * @author: xupengboo
 * @date: 2024/1/25 11:08
 * @description: 抽象建造者类（一餐）
 */
// 抽象建造者类 - AbstractMealBuilder
public abstract class AbstractMealBuilder {

    protected Meal meal = new Meal();

    public abstract void buildBurger();

    public abstract void buildDrink();

    public Meal getResult() {
        return meal;
    }

}
/*
// 同样可以使用接口来实现
interface AbstractMealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getResult();
}
*/
