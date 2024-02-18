package com.xupengboo.shape.impl;

import com.xupengboo.shape.Shape;

/**
 * @author: xupengboo
 * @date: 2024/2/18 17:24
 * @description: 圆形类
 */
// 具体享元
public class Circle implements Shape {

    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Draw a " + color + " circle");
    }

}
