package com.xupengboo.observer.abs;

import com.xupengboo.Subject;
import com.xupengboo.observer.Observer;

/**
 * @Author xupengboo
 * @Date 2024/3/11 13:25
 */
// 八进制 观察类
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }

}
