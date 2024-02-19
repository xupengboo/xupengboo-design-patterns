package com.xupengboo.工厂方法模式.factory;

import com.xupengboo.工厂方法模式.log.ConsoleLogger;
import com.xupengboo.工厂方法模式.log.Logger;

/**
 * @author: xupengboo
 * @date: 2024/1/24 11:50
 * @description: 控制台日志工厂类
 */
public class ConsoleLoggerFactory implements LoggerFactory{

    public Logger createLogger() {
        return new ConsoleLogger();
    }

}
