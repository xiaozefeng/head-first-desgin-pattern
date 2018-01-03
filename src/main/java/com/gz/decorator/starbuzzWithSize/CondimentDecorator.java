package com.gz.decorator.starbuzzWithSize;

/**
 * @author xiaozefeng
 */
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    /**
     * 获取描述
     *
     * @return
     */
    @Override
    public abstract String getDescription();
}
