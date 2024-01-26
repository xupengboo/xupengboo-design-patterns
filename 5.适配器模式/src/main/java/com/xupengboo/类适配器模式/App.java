package com.xupengboo.类适配器模式;

import com.xupengboo.类适配器模式.oldTem.OldTemperatureSensor;
import com.xupengboo.类适配器模式.oldTem.TemperatureSensor;

/**
 * @author: xupengboo
 * @date: 2024/1/25 16:12
 * @description: 客户端代码
 */
public class App {

    public static void main( String[] args ) {
        TemperatureSensor temperatureSensor = new OldTemperatureSensor();
        System.out.println("TemperatureSensor：" + temperatureSensor.getTemperature());
    }

}
