package com.gz.combining.composite;

/**
 * @author xiaozefeng
 */
public class DecoyDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
