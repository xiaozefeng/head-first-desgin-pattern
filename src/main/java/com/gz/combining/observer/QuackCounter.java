package com.gz.combining.observer;

/**
 * @author xiaozefeng
 */
public class QuackCounter implements Quackable {
    Quackable quackable;
    Observable observable;
    private static int numberofQuacks;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
        observable = new Observable(this);
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

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
