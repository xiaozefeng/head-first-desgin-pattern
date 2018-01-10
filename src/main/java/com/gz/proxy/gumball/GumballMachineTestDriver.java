package com.gz.proxy.gumball;

import java.rmi.Naming;

/**
 * @author xiaozefeng
 */
public class GumballMachineTestDriver {

    public static void main(String[] args) {
        try {
            GumballMachine gumballMachine=
                    new GumballMachine("gz", 300);
            gumballMachine.insertQuarter();
            Naming.rebind("gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
