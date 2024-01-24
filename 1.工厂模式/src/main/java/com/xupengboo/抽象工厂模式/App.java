package com.xupengboo.抽象工厂模式;

import com.xupengboo.抽象工厂模式.color.Color;
import com.xupengboo.抽象工厂模式.factory.ColorFactory;
import com.xupengboo.抽象工厂模式.factory.ShapeFactory;
import com.xupengboo.抽象工厂模式.shape.Shape;

/**
 * @author: xupengboo
 * @date: 2024/1/24 14:22
 * @description:
 */
public class App {

    public static void main(String[] args) {
        // 形状产品
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("CIRCLE");
        circle.draw();
        Shape rectangle = shapeFactory.createShape("RECTANGLE");
        rectangle.draw();
        // 颜色产品
        ColorFactory colorFactory = new ColorFactory();
        Color red = colorFactory.createColor("RED");
        red.fill();
        Color blue = colorFactory.createColor("BLUE");
        blue.fill();
    }

}
