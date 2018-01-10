package com.gz.combining.observer;

/**
 * @author xiaozefeng
 */
public interface QuackObservable {
    /**
     * 注册观察者
     */
   void registerObserver(Observer observer);

    /**
     * 通知观察者
     */
   void  notifyObservers();
}
