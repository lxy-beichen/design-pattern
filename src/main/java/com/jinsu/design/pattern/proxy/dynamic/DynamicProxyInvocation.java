package com.jinsu.design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 *
 * @author lxy-beichen
 * @date 2022年09月15日 22:22:06
 */
public class DynamicProxyInvocation implements InvocationHandler {

    private Object target;

    public DynamicProxyInvocation(Object target) {
        this.target = target;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("DynamicProxyInvocation start");
        Object obj = method.invoke(target);
        System.out.println("DynamicProxyInvocation end");
        return obj;
    }
}
