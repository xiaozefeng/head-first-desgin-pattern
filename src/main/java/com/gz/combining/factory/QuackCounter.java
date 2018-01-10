package com.gz.combining.factory;

/**
 * @author xiaozefeng
 */
public class QuackCounter implements Quackable {
    Quackable quackable;
    private static int numberofQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberofQuacks++;
    }

    public static int getNumberofQuacks() {
        return numberofQuacks;
    }

    @Override
    public String toString() {
        return "QuackCounter{" +
                "quackable=" + quackable +
                '}';
    }
}
