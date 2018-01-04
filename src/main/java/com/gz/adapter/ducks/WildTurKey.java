package com.gz.adapter.ducks;

/**
 * @author xiaozefeng
 */
public class WildTurKey implements TurKey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
