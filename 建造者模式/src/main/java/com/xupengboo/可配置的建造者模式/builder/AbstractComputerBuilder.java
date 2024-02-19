package com.xupengboo.可配置的建造者模式.builder;

/**
 * @author: xupengboo
 * @date: 2024/1/25 13:41
 * @description: 抽象建造者类
 */
// 抽象建造者类 - AbstractComputerBuilder
public abstract class AbstractComputerBuilder {

    protected Computer computer = new Computer();

    public abstract void buildCPU();

    public abstract void buildMemory();

    public abstract void buildStorage();

    public abstract void buildGraphicsCard(String graphicCard);

    public abstract void buildOperatingSystem(String operatingSystem);

    public Computer getResult() {
        return computer;
    }

}

/*
// 接口也可以
interface ComputerBuilder {
    void buildCPU();
    void buildMemory();
    void buildStorage();
    void buildGraphicsCard(String graphicsCard);
    void buildOperatingSystem(String operatingSystem);
    Computer getResult();
}
 */
