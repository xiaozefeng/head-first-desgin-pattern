package com.gz.templatemethod.barista;

/**
 * @author xiaozefeng
 */
public class Client {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("making tea");
        tea.prepareRecipe();

        System.out.println();
        System.out.println("making coffee");
        coffee.prepareRecipe();


        System.out.println();
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("making coffee with hook");
        coffeeWithHook.prepareRecipe();

        System.out.println();
        System.out.println("making tea with hook");
        teaWithHook.prepareRecipe();

    }
}
