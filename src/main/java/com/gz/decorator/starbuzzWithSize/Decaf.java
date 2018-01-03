package com.gz.decorator.starbuzzWithSize;


/**
 * @author xiaozefeng
 */
public class Decaf extends Beverage{
    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
