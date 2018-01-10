package com.gz.combining.adapter;

/**
 * @author xiaozefeng
 */
public class DecoyDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
