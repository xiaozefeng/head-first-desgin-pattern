package com.gz.combining.composite;

/**
 * @author xiaozefeng
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
