package com.xupengboo.对象适配器模式;

import com.xupengboo.对象适配器模式.oldLogger.OldLogger;

/**
 * @author: xupengboo
 * @date: 2024/1/25 16:12
 * @description: 客户端代码
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 通过适配器LoggerAdapter实现，OldLogger适配了NewLogger
        OldLogger oldLogger = new OldLogger();
        oldLogger.log("oldLogger","OLD");
        oldLogger.log("console","CONSOLE");
        oldLogger.log("file","FILE");
    }

}
