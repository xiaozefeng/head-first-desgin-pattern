package com.gz.chapter1.strategy2;

/** 角色
 * @author xiaozefeng
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void fight(){
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
