package com.gz.chapter1.strategy2;

/**
 * @author xiaozefeng
 */
public class Troll extends Character{
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
