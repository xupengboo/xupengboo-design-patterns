package com.xupengboo.remote;

import com.xupengboo.command.Command;

/**
 * @author: xupengboo
 * @date: 2024/2/28 15:15
 * @description: 遥控器 调用者
 */
// 调用者
public class RemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

}
