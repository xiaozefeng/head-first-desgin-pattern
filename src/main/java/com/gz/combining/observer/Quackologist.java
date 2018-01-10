package com.gz.combining.observer;

/**
 * @author xiaozefeng
 */
public class Quackologist implements Observer {
    @Override
    public void update(Quackable duck) {
        System.out.println("Quackologist" + duck + "just quacked");
    }
}
