package com.gz.factory.abstraction;

/**
 * @author xiaozefeng
 */
public interface PizzaIngredientFactory {

    /**
     * 生面团
     * @return
     */
    Dough createDough();

    /**
     * 酱油；沙司；调味汁
     * @return
     */
    Sauce createSauce();

    /**
     * 奶酪；干酪；
     * @return
     */
    Cheese createCheese();

    /**
     * 蔬菜
     * @return
     */
    Veggies[] createVeggies();

    /**
     * 香肠
     * @return
     */
    Pepperoni createPepperoni();

    /**
     * 蛤蚌
     * @return
     */
    Clams createClam();
}
