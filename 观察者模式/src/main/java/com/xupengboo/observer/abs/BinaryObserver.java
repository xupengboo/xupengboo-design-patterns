package com.xupengboo.observer.abs;

import com.xupengboo.Subject;
import com.xupengboo.observer.Observer;

/**
 * @Author xupengboo
 * @Date 2024/3/11 13:24
 */
// 二进制 观察类
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }

}
