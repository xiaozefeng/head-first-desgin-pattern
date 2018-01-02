package com.gz.chapter1.strategy2;

/**
 * @author xiaozefeng
 */
public class King extends Character{
    public King() {
        weaponBehavior = new KnifeBehavior();
    }

}
