package com.xupengboo.对象适配器模式.oldLogger;

import com.xupengboo.对象适配器模式.adapter.LoggerAdapter;

/**
 * @author: xupengboo
 * @date: 2024/1/26 10:57
 * @description: 旧日志实现类
 */
public class OldLogger implements Logger{

    LoggerAdapter loggerAdapter;

    public void log(String message, String logType) {
        if (logType.equalsIgnoreCase("OLD")) {
            System.out.println("OldLogger - Error: " + message);
            System.out.println("OldLogger - Message: " + message);
        } else if (logType.equalsIgnoreCase("CONSOLE") || logType.equalsIgnoreCase("FILE")) {
            loggerAdapter = new LoggerAdapter(logType);
            loggerAdapter.log(message,logType);
        } else {
            System.out.println("not supported!");
        }
    }

}
