package com.gz.combining.observer;

/**
 * @author xiaozefeng
 */
public class DuckCall implements Quackable {
    Observable observable;
    @Override
    public void quack() {
        System.out.println("Kwak");
        this.notifyObservers();

    }

    public DuckCall() {
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
