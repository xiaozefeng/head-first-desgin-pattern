package com.gz.combining.observer;

/**
 * extends QuackObservable 确保所有Duck 都实现此接口
 */
public interface Quackable extends QuackObservable{
    void quack();
}
