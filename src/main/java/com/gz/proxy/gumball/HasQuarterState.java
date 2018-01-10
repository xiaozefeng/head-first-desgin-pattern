package com.gz.proxy.gumball;

/**
 * @author xiaozefeng
 */
public class HasQuarterState implements State {
    private transient GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter ejected");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispense");
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
