package com.gz.adapter.ducks;

import java.util.Random;

/**
 * @author xiaozefeng
 */
public class DuckAdapter implements TurKey{
    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
