package com.xupengboo;

/**
 * @Author xupengboo
 * @Date 2024/3/11 12:51
 */
// 备忘录 - 备忘录类
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
