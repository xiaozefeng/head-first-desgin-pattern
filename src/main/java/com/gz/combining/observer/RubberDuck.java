package com.gz.combining.observer;

/**
 * @author xiaozefeng
 */
public class RubberDuck implements Quackable {
    Observable observable;

    @Override
    public void quack() {
        System.out.println("Squeak");
        this.notifyObservers();
    }

    public RubberDuck() {
        this.observable = new Observable(this);
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
