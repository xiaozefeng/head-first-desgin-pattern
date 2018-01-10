package com.gz.combining.decorator;

/**
 * @author xiaozefeng
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
