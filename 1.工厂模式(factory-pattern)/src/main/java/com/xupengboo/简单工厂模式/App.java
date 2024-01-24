package com.xupengboo.简单工厂模式;

import com.xupengboo.简单工厂模式.shape.Shape;
import com.xupengboo.简单工厂模式.shape.ShapeFactory;

/**
 * Hello world!
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
