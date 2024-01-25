package com.xupengboo.标准建造者模式;

import com.xupengboo.标准建造者模式.builder.Meal;
import com.xupengboo.标准建造者模式.builder.NonVegMealBuilder;
import com.xupengboo.标准建造者模式.builder.VegMealBuilder;
import com.xupengboo.标准建造者模式.builder.Waiter;

/**
 * 客户端代码
 */
public class App {

    public static void main( String[] args ) {
        // 创建VegMeal
        VegMealBuilder vegMealBuilder = new VegMealBuilder();
        Waiter waiter = new Waiter();
        Meal vegMeal = waiter.construct(vegMealBuilder);
        vegMeal.showItems();
        // 创建NonVegMeal
        NonVegMealBuilder nonVegMealBuilder = new NonVegMealBuilder();
        Meal nonVegMeal = waiter.construct(nonVegMealBuilder);
        nonVegMeal.showItems();
    }

}
