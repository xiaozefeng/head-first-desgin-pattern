package com.gz.factory.method;

/**
 * @author xiaozefeng
 */
public abstract class PizzaStore {
    /**
     * 创建pizza
     * @param item
     * @return
     */
    abstract Pizza createPizza(String item);

    /**
     * 制作pizza
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("Making a " + pizza.getName() + "---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
