package com.gz.decorator.starbuzzWithSize;


/**
 * @author xiaozefeng
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
