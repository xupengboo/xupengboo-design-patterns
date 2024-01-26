package com.xupengboo.类适配器模式.adapter;

import com.xupengboo.类适配器模式.newTem.NewTemperatureSensor;
import com.xupengboo.类适配器模式.oldTem.TemperatureSensor;

/**
 * @author: xupengboo
 * @date: 2024/1/26 11:15
 * @description: 适配器类
 */

/**
 * 适配器类：通过继承被适配者类来实现。
 */
public class TemperatureSensorAdapter extends NewTemperatureSensor implements TemperatureSensor {

    public double getTemperature() {
        return readTemperatureCelsius();
    }

}
