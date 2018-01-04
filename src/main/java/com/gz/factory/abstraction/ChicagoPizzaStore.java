package com.gz.factory.abstraction;

/**
 * @author xiaozefeng
 */
public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String item) {
        assert item != null && !"".equals(item);

        Pizza pizza = null;
        PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
        switch (item) {
            case "cheese":
                pizza = new CheesePizza(factory);
                pizza.name = "芝加哥风格奶酪披萨";
                break;
            case "veggie":
                pizza = new VeggiePizza(factory);
                pizza.name = "芝加哥风格蔬菜披萨";
                break;
            case "clam":
                pizza = new ClamPizza(factory);
                pizza.name = "芝加哥风格蛤蚌披萨";
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(factory);
                pizza.name = "芝加哥风格香肠披萨";
                break;
            default:
                throw new UnsupportedOperationException("不支持的披萨类型");
        }
        return pizza;
    }
}
