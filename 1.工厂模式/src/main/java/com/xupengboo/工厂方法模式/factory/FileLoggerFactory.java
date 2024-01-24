package com.xupengboo.工厂方法模式.factory;

import com.xupengboo.工厂方法模式.log.FileLogger;
import com.xupengboo.工厂方法模式.log.Logger;

/**
 * @author: xupengboo
 * @date: 2024/1/24 11:49
 * @description: 文件日志工厂类
 */
public class FileLoggerFactory implements LoggerFactory{

    public Logger createLogger() {
        return new FileLogger();
    }

}
