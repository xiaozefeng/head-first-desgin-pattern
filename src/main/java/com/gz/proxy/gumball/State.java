package com.gz.proxy.gumball;

import java.io.Serializable;

/**
 *
 * @author xiaozefeng
 */
public interface State extends Serializable{

    /**
     * 投入25分钱
     */
    void insertQuarter();

    /**
     * 退出25分钱
     */
    void ejectQuarter();

    /**
     * 转动手柄
     */
    void turnCrank();

    /**
     * 分配
     */
    void dispense();

    /**
     * 重新填入
     */
    void refill();

}
