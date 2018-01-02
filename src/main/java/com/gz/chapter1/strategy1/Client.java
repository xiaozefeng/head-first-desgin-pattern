package com.gz.chapter1.strategy1;

/**
 * @author xiaozefeng
 */
public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();

        // 动态修改行为
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
    }
}
