package com.gz.adapter.ducks;

/**
 * @author xiaozefeng
 */
public class MallardDuck implements Duck{

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
