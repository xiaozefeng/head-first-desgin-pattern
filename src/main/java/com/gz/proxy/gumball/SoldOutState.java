package com.gz.proxy.gumball;

/**
 * @author xiaozefeng
 */
public class SoldOutState implements State {
    private transient GumballMachine gumballMachine;
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, But there are no gumballs ");
    }

    @Override
    public void dispense() {
        System.out.println("No gumballs dispense");
    }

    @Override
    public void refill() {
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    @Override
    public String toString() {
        return "sold out";
    }
}
