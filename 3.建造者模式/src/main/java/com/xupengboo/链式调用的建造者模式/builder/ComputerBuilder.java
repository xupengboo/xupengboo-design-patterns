package com.xupengboo.链式调用的建造者模式.builder;

/**
 * @author: xupengboo
 * @date: 2024/1/25 14:00
 * @description: 建造者类
 */
// 建造者类 - ComputerBuilder
public class ComputerBuilder {

    private Computer computer = new Computer();

    public ComputerBuilder buildCPU(String CPU) {
        computer.setCPU(CPU);
        return this;
    }

    public ComputerBuilder buildMemory(String memory) {
        computer.setMemory(memory);
        return this;
    }

    public ComputerBuilder buildStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    public ComputerBuilder buildGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
        return this;
    }

    public ComputerBuilder buildOperatingSystem(String operatingSystem) {
        computer.setOperatingSystem(operatingSystem);
        return this;
    }

    public Computer getResult() {
        return computer;
    }

}
