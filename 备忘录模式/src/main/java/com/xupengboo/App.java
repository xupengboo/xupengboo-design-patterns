package com.xupengboo;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 创建发起人并设置状态
        Originator originator = new Originator();
        originator.setState("State 1");

        // 创建备忘录
        Memento memento = originator.createMemento();

        // 创建管理者并保存备忘录
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);

        // 改变发起人状态
        originator.setState("State 2");
        System.out.println("Current state: " + originator.getState()); // 输出：Current state: State 2

        // 使用备忘录回复发起人状态
        originator.setMemento(caretaker.getMemento());
        System.out.println("Restored state: " + originator.getState()); // 输出：Restored state: State 1
    }

}
