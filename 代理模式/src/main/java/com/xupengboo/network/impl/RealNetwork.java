package com.xupengboo.network.impl;

import com.xupengboo.network.Network;

/**
 * @author: xupengboo
 * @date: 2024/2/19 16:55
 * @description: 真·网络类
 */
// 具体主题
public class RealNetwork implements Network {

    private String url;

    public RealNetwork(String url) {
        this.url = url;
    }

    public void browse() {
        System.out.println("Browsing " + url);
    }

}
