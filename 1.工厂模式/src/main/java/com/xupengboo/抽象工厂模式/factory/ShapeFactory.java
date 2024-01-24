package com.xupengboo.抽象工厂模式.factory;

import com.xupengboo.抽象工厂模式.color.Color;
import com.xupengboo.抽象工厂模式.shape.Circle;
import com.xupengboo.抽象工厂模式.shape.Rectangle;
import com.xupengboo.抽象工厂模式.shape.Shape;

/**
 * @author: xupengboo
 * @date: 2024/1/24 13:59
 * @description: 形状工厂
 */
public class ShapeFactory extends AbstractFactory{

    public Shape createShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

    public Color createColor(String colorType) {
        return null;
    }

}
