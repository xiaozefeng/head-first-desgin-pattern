package com.gz.proxy.gumball;

import java.rmi.RemoteException;

/**
 * @author xiaozefeng
 */
public class GumballMonitor {

    private GumballMachineRemote machine;


    public GumballMonitor(GumballMachineRemote gumballMachineRemote) {
        this.machine = gumballMachineRemote;
    }

    public void report(){
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
