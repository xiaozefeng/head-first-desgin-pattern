package com.gz.combining.observer;

/**
 * @author xiaozefeng
 */
public class GooseAdapter implements Quackable {
    private Goose goose;
    Observable observable;


    public GooseAdapter(Goose goose) {
        this.observable = new Observable(this);
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.hook();
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
