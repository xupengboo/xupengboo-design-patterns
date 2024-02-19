package com.xupengboo.简单工厂模式.shape;

import com.xupengboo.简单工厂模式.shape.Circle;
import com.xupengboo.简单工厂模式.shape.Rectangle;
import com.xupengboo.简单工厂模式.shape.Shape;

/**
 * @author: xupengboo
 * @date: 2024/1/24 11:14
 * @description: 形状工厂类
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        // 判空
        if (shapeType == null) {
            return null;
        }
        // 分类
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

}
