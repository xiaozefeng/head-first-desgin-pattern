package com.gz.templatemethod.barista;

/**
 * @author xiaozefeng
 */
public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void addCondiments() {
        System.out.println("加入柠檬");
    }

    @Override
    protected void brew() {
        System.out.println("用沸水冲茶");
    }

    @Override
    public boolean customWantAddCondiments() {
        return false;
    }
}
