package com.gz.combining.factory;

/**
 * @author xiaozefeng
 */
public class DecoyDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
