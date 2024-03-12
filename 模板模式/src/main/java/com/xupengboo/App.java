package com.xupengboo;

import com.xupengboo.cup.abs.CupWithHolder;
import com.xupengboo.cup.abs.CupWithoutHolder;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        CupWithHolder cupWithHolder = new CupWithHolder();
        cupWithHolder.makeCup(); // 制造带把手的杯子
        CupWithoutHolder cupWithoutHolder = new CupWithoutHolder();
        cupWithHolder.makeCup(); // 制造不带把手的杯子
    }

}
