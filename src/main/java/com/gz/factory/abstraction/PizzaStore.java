package com.gz.factory.abstraction;

/**
 * @author xiaozefeng
 */
public abstract class PizzaStore {
    /**
     * 制作pizza
     * @param item
     * @return
     */
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("制作一个" + pizza.name + "---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
