package com.gz.factory.abstraction;


/**
 * @author xiaozefeng
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        assert item != null && !"".equals(item);

        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.name = "纽约风格奶酪披萨";
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(factory);
            pizza.name = "纽约风格蔬菜披萨";
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.name = "纽约风格蛤蚌披萨";
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(factory);
            pizza.name = "纽约风格香肠披萨";
        }
        if (pizza == null) {
            throw new UnsupportedOperationException("不支持的披萨类型");
        }
        return pizza;
    }
}
