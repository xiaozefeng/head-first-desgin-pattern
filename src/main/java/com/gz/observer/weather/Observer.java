package com.gz.observer.weather;

/**
 * @author xiaozefeng
 */
public interface Observer {
    /**
     * 更新
     * @param temp
     * @param humidity
     * @param pressure
     */
    void update(float temp, float humidity, float pressure);
}
