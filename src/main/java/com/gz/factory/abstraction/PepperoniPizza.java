package com.gz.factory.abstraction;

/**
 * @author xiaozefeng
 */
public class PepperoniPizza extends Pizza {
    private PizzaIngredientFactory factory;
    public PepperoniPizza(PizzaIngredientFactory factory) {
        this.factory = factory;
    }

    @Override
    void prepare() {
        System.out.println("准备 " + name);
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
    }
}
