package com.gz.decorator.starbuzzWithSize;


/**
 * @author xiaozefeng
 */
public class DarkRoast extends Beverage{
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
