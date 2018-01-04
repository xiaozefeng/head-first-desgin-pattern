package com.gz.adapter.ducks;

/**
 * @author xiaozefeng
 */
public class DuckTestDriver {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        TurKey turKey = new WildTurKey();

        Duck turkeyAdapter = new TurKeyAdapter(turKey);

        System.out.println("The Turkey says:");
        turKey.gobble();
        turKey.fly();
        System.out.println();

        System.out.println("The duck says:");
        duck.quack();
        duck.fly();
        System.out.println();

        System.out.println("The turkeyAdapter says:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
