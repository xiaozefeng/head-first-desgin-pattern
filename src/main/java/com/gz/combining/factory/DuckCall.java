package com.gz.combining.factory;

/**
 * @author xiaozefeng
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
