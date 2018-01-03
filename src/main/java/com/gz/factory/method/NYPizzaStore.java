package com.gz.factory.method;

/**
 * @author xiaozefeng
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new NYStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            return new NYStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            return new NYStyleClamPizza();
        } else if ("pepperoni".equals(item)) {
            return new NYStylePepperoniPizza();
        }
        throw new UnSupportPizzaException("不支持的pizza类型");
    }
}
