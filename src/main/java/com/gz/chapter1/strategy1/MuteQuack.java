package com.gz.chapter1.strategy1;

/**
 * @author xiaozefeng
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
