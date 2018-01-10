package com.gz.proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author xiaozefeng
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    /**
     * 售空状态
     */
    private State soldOutState;
    /**
     * 没有投入25分钱状态
     */
    private State noQuarterState;

    /**
     * 有投入25分钱状态
     */
    private State hasQuarterState;

    /**
     * 在售状态
     */
    private State soldState;

    /**
     * 记录口香糖机当前的状态
     */
    private State currentState;

    /**
     * 库存
     */
    private int count;

    private String loaction;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldState(this);

        this.count = numberGumballs;
        this.loaction = location;
        if (numberGumballs > 0) {
            this.currentState = noQuarterState;
        } else {
            this.currentState = soldOutState;
        }
    }

    public void insertQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
    }


    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0) {
            count -= 1;
        }
    }

    public void refill(int count) {
        this.count += count;
        System.out.println("The gumball machine was just refilled; it is new count is: " + this.count);
        currentState.refill();
    }


    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return loaction;
    }

    @Override
    public State getState() throws RemoteException {
        return currentState;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + this.count + " gumball");
        if (this.count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + currentState + "\n");
        return result.toString();
    }
}
