package com.gz.proxy.gumball;

import java.rmi.Naming;

/**
 * @author xiaozefeng
 */
public class GumballMonitorTestDriver {
    public static void main(String[] args) {
        try {
            GumballMachineRemote machine =
                    (GumballMachineRemote) Naming.lookup("rmi://127.0.0.1/gumballmachine");
            System.out.println(machine.getLocation());
            System.out.println(machine.getCount());
            System.out.println(machine.getState());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
