package com.xupengboo.proxy;

import com.xupengboo.network.Network;

/**
 * @author: xupengboo
 * @date: 2024/2/19 16:55
 * @description: 网络代理类
 */
// 代理
public class NetworkProxy implements Network {

    private Network network;

    public NetworkProxy(Network network) {
        this.network = network;
    }

    public void browse() {
        if (checkAccess()) {
            network.browse();
        } else {
            System.out.println("Access denied");
        }
    }

    private boolean checkAccess(){
        // Check access permission
        return true;
    }

}
