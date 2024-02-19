package com.xupengboo.类适配器模式.oldTem;

import com.xupengboo.类适配器模式.adapter.TemperatureSensorAdapter;

/**
 * @author: xupengboo
 * @date: 2024/1/26 11:20
 * @description: 旧温度感应器
 */
public class OldTemperatureSensor implements TemperatureSensor{

    TemperatureSensorAdapter temperatureSensorAdapter = new TemperatureSensorAdapter();

    public double getTemperature() {
        return temperatureSensorAdapter.getTemperature();
    }

}
