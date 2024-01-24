package com.xupengboo.抽象工厂模式.factory;

import com.xupengboo.抽象工厂模式.color.Blue;
import com.xupengboo.抽象工厂模式.color.Color;
import com.xupengboo.抽象工厂模式.color.Red;
import com.xupengboo.抽象工厂模式.shape.Shape;

/**
 * @author: xupengboo
 * @date: 2024/1/24 14:12
 * @description: 颜色工厂
 */
public class ColorFactory extends AbstractFactory{

    public Color createColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if(colorType.equalsIgnoreCase("RED")){
            return new Red();
        } else if(colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    public Shape createShape(String shapeType) {
        return null;
    }

}
