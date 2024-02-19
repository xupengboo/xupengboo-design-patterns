package com.xupengboo.简单工厂模式;

import com.xupengboo.简单工厂模式.shape.Shape;
import com.xupengboo.简单工厂模式.shape.ShapeFactory;

/**
 * @author: xupengboo
 * @date: 2024/1/25 16:12
 * @description: 客户端代码
 */
public class App {

    public static void main( String[] args ) {
        // 1. 创建工厂对象
        ShapeFactory shapeFactory = new ShapeFactory();
        // 2. 创建圆形对象
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        // 3. 创建矩形对象
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();
    }

}
