package com.gz.combining.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaozefeng
 */
public class Observable implements QuackObservable{
    List<Observer> observers = new ArrayList();

    Quackable duck;

    public Observable(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(duck);
        }

    }
}
