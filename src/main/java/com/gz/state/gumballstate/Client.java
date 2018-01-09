package com.gz.state.gumballstate;

/**
 * @author xiaozefeng
 */
public class Client {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(2);
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
