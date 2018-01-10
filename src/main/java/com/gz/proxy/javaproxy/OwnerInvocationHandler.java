package com.gz.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiaozefeng
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("get") || method.getName().startsWith("set")) {
            return method.invoke(personBean, args);
        } else if (method.getName().equals("setHotOrNotRating")) {
            throw new IllegalAccessException();
        }
        return null;
    }
}
