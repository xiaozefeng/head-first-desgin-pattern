package com.gz.chapter1.strategy2;

/**
 * @author xiaozefeng
 */
public class Queen extends Character{
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
