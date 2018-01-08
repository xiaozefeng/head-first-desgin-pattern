package com.gz.templatemethod.barista;

/**
 * @author xiaozefeng
 */
public class Tea extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("加柠檬");
    }

    @Override
    protected void brew() {
        System.out.println("用沸水煮茶");
    }
}
