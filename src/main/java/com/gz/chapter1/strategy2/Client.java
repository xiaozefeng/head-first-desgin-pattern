package com.gz.chapter1.strategy2;

/**
 * @author xiaozefeng
 */
public class Client {
    public static void main(String[] args) {
        Character character = new King();
        character.fight();

        character.setWeaponBehavior(new SwordBehavior());
        character.fight();
    }
}
