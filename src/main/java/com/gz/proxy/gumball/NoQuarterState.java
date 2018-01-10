package com.gz.proxy.gumball;

/**
 * @author xiaozefeng
 */
public class NoQuarterState implements State {
    private transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setCurrentState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You are turned, but there's no quarrer");
    }

    @Override
    public void dispense() {
        System.out.println("You need pay first");
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "Waiting for quarter";
    }
}
