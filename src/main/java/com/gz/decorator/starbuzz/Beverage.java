package com.gz.decorator.starbuzz;

/**
 * @author xiaozefeng
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    /**
     * 计算价钱
     * @return
     */
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
