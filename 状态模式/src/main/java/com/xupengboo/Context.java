package com.xupengboo;

import com.xupengboo.state.State;

/**
 * @Author xupengboo
 * @Date 2024/3/11 13:48
 */
// 上下文类 方便操控
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeChannel() {
        state.changeChannel();
    }

    public void changeSound() {
        state.changeSound();
    }

}
