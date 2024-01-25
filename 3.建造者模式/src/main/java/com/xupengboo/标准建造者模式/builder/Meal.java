package com.xupengboo.标准建造者模式.builder;

/**
 * @author: xupengboo
 * @date: 2024/1/25 11:06
 * @description: 产品类（一餐）
 */
// 产品类 - Meal（一餐）
public class Meal {

    private String burger;

    private String drink;

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void showItems() {
        System.out.println("Meal Items: Burger - " + burger + ", Drink - " + drink);
    }

}
