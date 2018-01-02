package com.gz.chapter1.strategy1;

/**
 * @author xiaozefeng
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭");
    }
}
