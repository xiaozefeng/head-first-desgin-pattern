package com.gz.factory.abstraction;

/**
 * @author xiaozefeng
 */
public class Client {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");

        chicagoStore.orderPizza("cheese");


        nyStore.orderPizza("clam");

        chicagoStore.orderPizza("clam");

        nyStore.orderPizza("pepperoni");

        chicagoStore.orderPizza("pepperoni");

        nyStore.orderPizza("veggie");

        chicagoStore.orderPizza("veggie");
    }
}
