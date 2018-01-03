package com.gz.factory.method;

/**
 * @author xiaozefeng
 */
public class UnSupportPizzaException extends RuntimeException{
    public UnSupportPizzaException(String message) {
        super(message);
    }
}
