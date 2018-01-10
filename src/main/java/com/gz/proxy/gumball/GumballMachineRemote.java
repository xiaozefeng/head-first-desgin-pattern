package com.gz.proxy.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author xiaozefeng
 */
public interface GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
