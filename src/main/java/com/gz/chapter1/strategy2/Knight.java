package com.gz.chapter1.strategy2;

/**
 * @author xiaozefeng
 */
public class Knight extends Character{
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}
