package com.gz.chapter1.strategy1;

/**
 * @author xiaozefeng
 */
public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("I can not fly");
    }
}
