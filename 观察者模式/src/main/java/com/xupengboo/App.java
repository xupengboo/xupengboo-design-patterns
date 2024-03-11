package com.xupengboo;

import com.xupengboo.observer.abs.BinaryObserver;
import com.xupengboo.observer.abs.HexaObserver;
import com.xupengboo.observer.abs.OctalObserver;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
