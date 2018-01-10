package com.gz.combining.decorator;

/**
 * @author xiaozefeng
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
