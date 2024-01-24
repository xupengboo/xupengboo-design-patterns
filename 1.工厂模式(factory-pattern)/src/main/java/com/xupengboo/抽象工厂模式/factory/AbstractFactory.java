package com.xupengboo.抽象工厂模式.factory;

import com.xupengboo.抽象工厂模式.color.Color;
import com.xupengboo.抽象工厂模式.shape.Shape;

/**
 * @author: xupengboo
 * @date: 2024/1/24 13:57
 * @description: 抽象工厂类
 * @Tips: 别看这里说的是抽象工厂，并不代表着要一定要用 `abstract class xxx` 实现。接口和抽象类都是可以实现抽象工厂模式的，具体要用哪个就实际情况而言。
 * 理解这句话就能明白：
 *      抽象工厂（Abstract Factory）：声明了一组用于创建产品对象的方法，每个方法对应一种产品类型。抽象工厂可以是接口或抽象类。
 */
public abstract class AbstractFactory {
    // 形状产品
    public abstract Shape createShape(String shapeType);
    // 颜色产品
    public abstract Color createColor(String colorType);
}
/*
 // 也可以使用接口！
 public interface AbstractFactory {
    Shape createShape(String shapeType);
    Color createColor(String colorType);
 }
*/
