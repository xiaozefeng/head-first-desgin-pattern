package com.gz.decorator.starbuzzWithSize;

/**
 * @author xiaozefeng
 */
public abstract class Beverage {
    public enum Size{
        TALL, GRANDE, VENTI
    }

    Size size = Size.TALL;

    String description = "Unknown Beverage";

    /**
     * 计算价钱
     * @return
     */
    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}
