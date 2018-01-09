package com.gz.state.gumballstate;


/**
 * @author xiaozefeng
 */
public class SoldState implements State {

    GumballMachine machine;


    public SoldState(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you are already turn the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        machine.realeaseBall();
        if (machine.getCount() > 0) {
            machine.setCurrentState(machine.getNoQuarterState());
        } else {
            machine.setCurrentState(machine.getSoldOutState());
        }
    }

    @Override
    public void refill() {

    }

    @Override
    public String toString() {
        return "dispensing a gumball!";
    }
}
