package com.gz.observer.weather;

/**
 * @author xiaozefeng
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者们
     */
    void notifyObservers();
}
