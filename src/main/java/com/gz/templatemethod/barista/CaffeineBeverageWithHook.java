package com.gz.templatemethod.barista;

/**
 * @author xiaozefeng
 */
public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customWantAddCondiments()) {
            addCondiments();
        }
    }

    /**
     * 加入调料
     */
    protected abstract void addCondiments();


    /**
     *
     */
    private void pourInCup() {
        System.out.println("把冲好的饮料倒入杯中");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("把水煮沸");
    }

    public boolean customWantAddCondiments(){
        return true;
    }
}
