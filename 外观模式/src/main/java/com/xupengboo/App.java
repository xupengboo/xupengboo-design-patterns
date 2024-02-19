package com.xupengboo;

import com.xupengboo.facade.ComputerFacade;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 以计算机为例：下面有CPU、内存、硬盘驱动器等子系统
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }

}
