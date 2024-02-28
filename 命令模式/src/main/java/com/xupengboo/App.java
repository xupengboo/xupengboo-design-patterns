package com.xupengboo;

import com.xupengboo.command.Command;
import com.xupengboo.command.impl.TurnOffCommand;
import com.xupengboo.command.impl.TurnOnCommand;
import com.xupengboo.domin.TV;
import com.xupengboo.remote.RemoteControl;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 电视机
        TV tv = new TV();

        // 创建指令
        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);

        // 遥控器
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();
    }

}
