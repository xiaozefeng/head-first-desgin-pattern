package com.gz.proxy.hello;

import java.rmi.Remote;
import java.rmi.RemoteException;

/** 制作远程接口
 * @author xiaozefeng
 */
public interface MyRemote extends Remote{
    /**
     * 声明方法会跑出RemoteException
     * @return
     * @throws RemoteException
     */
    String sayHello() throws RemoteException;
}
