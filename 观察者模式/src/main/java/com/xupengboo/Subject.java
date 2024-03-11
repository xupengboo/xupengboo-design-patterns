package com.xupengboo;

import com.xupengboo.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xupengboo
 * @Date 2024/3/11 13:19
 */
// 被观察者 - 主题类
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
