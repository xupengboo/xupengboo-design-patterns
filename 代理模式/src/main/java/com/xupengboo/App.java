package com.xupengboo;

import com.xupengboo.network.Network;
import com.xupengboo.network.impl.RealNetwork;
import com.xupengboo.proxy.NetworkProxy;

/**
 * Hello world!
 *
 */
// 客户端代码
public class App {

    public static void main( String[] args ) {
        // 网络代理访问
        Network realNetwork = new RealNetwork("https://www.example.com");
        Network networkProxy = new NetworkProxy(realNetwork);
        networkProxy.browse();
    }

}
