package com.xupengboo.可配置的建造者模式.builder;

/**
 * @author: xupengboo
 * @date: 2024/1/25 13:50
 * @description: 指导者类
 */
// 指导者类 - Director
public class Director {

    public Computer construct(AbstractComputerBuilder builder,String graphicsCard, String operatingSystem) {
        builder.buildCPU();
        builder.buildMemory();
        builder.buildStorage();
        builder.buildGraphicsCard(graphicsCard);
        builder.buildOperatingSystem(operatingSystem);
        return builder.getResult();
    }

}
