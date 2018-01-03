package com.gz.factory.method;

/**
 * @author xiaozefeng
 */
public class Client {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
    }
}
