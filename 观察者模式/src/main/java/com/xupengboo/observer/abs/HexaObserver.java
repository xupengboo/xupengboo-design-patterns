package com.xupengboo.observer.abs;

import com.xupengboo.Subject;
import com.xupengboo.observer.Observer;

/**
 * @Author xupengboo
 * @Date 2024/3/11 13:27
 */
// 十六进制 观察类
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }

}
