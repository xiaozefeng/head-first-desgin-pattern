package com.gz.combining.observer;

/**
 * @author xiaozefeng
 */
public class DecoyDuck implements Quackable {
    Observable observable;
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
        this.notifyObservers();
    }

    public DecoyDuck() {
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
