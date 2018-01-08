package com.gz.templatemethod.barista;

/**
 * @author xiaozefeng
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook{
    @Override
    protected void addCondiments() {
        System.out.println("加入糖和牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("冲泡咖啡");
    }
}
