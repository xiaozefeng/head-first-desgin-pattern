package com.gz.proxy.hello;

import java.rmi.Naming;

/**
 * @author xiaozefeng
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        try {
            MyRemote remote = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            System.out.println(remote.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
