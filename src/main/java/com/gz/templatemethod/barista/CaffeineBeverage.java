package com.gz.templatemethod.barista;

/**
 * @author xiaozefeng
 */
public abstract class CaffeineBeverage {

    /**
     * 模板方法
     */
    public final void prepareRecipe() {
        bollWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 把咖啡因材料倒入杯内
     */
    private void pourInCup() {
        System.out.println("把冲好的饮料倒入杯中");
    }

    /**
     * 加入调料
     */
    protected abstract void addCondiments();

    /**
     * 冲泡
     */
    protected abstract void brew();

    private void bollWater() {
        System.out.println("把水煮沸");
    }
}
