package com.gz.proxy.gumball;


import java.rmi.RemoteException;

/**
 * @author xiaozefeng
 */
public class Client {
    public static void main(String[] args) throws RemoteException {
        GumballMachine machine = new GumballMachine("gz",2);
        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();
        System.out.println(machine);

        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();

        machine.refill(5);
        machine.insertQuarter();
        machine.turnCrank();

        System.out.println(machine);
    }
}
