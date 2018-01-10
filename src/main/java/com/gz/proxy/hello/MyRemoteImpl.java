package com.gz.proxy.hello;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author xiaozefeng
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello RMI";
    }

    public static void main(String[] args) {
        try {
            Naming.rebind("RemoteHello", new MyRemoteImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
