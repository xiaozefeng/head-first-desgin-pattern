package com.gz.combining.observer;

/**
 * @author xiaozefeng
 */
public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        this.notifyObservers();
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
