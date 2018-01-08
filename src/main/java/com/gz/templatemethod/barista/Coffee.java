package com.gz.templatemethod.barista;

/**
 * @author xiaozefeng
 */
public class Coffee extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("用沸水冲泡咖啡");
    }
}
