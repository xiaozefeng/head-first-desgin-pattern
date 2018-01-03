package com.gz.decorator.starbuzz;

/**
 * @author xiaozefeng
 */
public abstract class CondimentDecorator extends Beverage{
    /**
     * 获取描述
     * @return
     */

    @Override
    public abstract String getDescription();
}
