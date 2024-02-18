package com.xupengboo.shape.factory;

import com.xupengboo.shape.Shape;
import com.xupengboo.shape.impl.Circle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xupengboo
 * @date: 2024/2/18 17:26
 * @description: 形状工厂类
 */
// 享元工厂
public class ShapeFactory {

    public static final Map<String, Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color) {
        Shape circle = circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color,circle);
        }
        return circle;
    }

}
