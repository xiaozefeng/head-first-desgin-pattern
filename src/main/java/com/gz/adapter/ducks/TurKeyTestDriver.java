package com.gz.adapter.ducks;

/**
 * @author xiaozefeng
 */
public class TurKeyTestDriver {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        TurKey duckAdapter = new DuckAdapter(duck);

        for (int i = 0; i < 10; i++) {
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
