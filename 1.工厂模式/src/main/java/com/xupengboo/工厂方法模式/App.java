package com.xupengboo.工厂方法模式;

import com.xupengboo.工厂方法模式.factory.ConsoleLoggerFactory;
import com.xupengboo.工厂方法模式.factory.FileLoggerFactory;
import com.xupengboo.工厂方法模式.factory.LoggerFactory;
import com.xupengboo.工厂方法模式.log.Logger;

/**
 * @author: xupengboo
 * @date: 2024/1/24 11:51
 * @description:
 */
public class App {

    public static void main(String[] args) {
        // 使用FileLoggerFactory创建FileLogger
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        Logger fileLogger = fileLoggerFactory.createLogger();
        fileLogger.logMessage("This is a message logged to file.");
        // 使用ConsoleLoggerFactory创建ConsoleLogger
        LoggerFactory consoleLoggerFactory = new ConsoleLoggerFactory();
        Logger consoleLogger = consoleLoggerFactory.createLogger();
        consoleLogger.logMessage("This a message logged to console.");
    }

}
