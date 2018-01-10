package com.gz.combining.ducks;

/**
 * @author xiaozefeng
 */
public class DecoyDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
