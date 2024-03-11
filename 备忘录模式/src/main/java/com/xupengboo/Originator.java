package com.xupengboo;

/**
 * @Author xupengboo
 * @Date 2024/3/11 12:50
 */
// 发起人 - 发起人类
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

}
