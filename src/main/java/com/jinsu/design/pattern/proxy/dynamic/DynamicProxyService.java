package com.jinsu.design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理服务
 *
 * @author lxy-beichen
 * @date 2022年09月15日 22:24:58
 */
public class DynamicProxyService {

    private Object target;
    private InvocationHandler invocationHandler;

    public DynamicProxyService(Object target, InvocationHandler invocationHandler) {
        this.target = target;
        this.invocationHandler = invocationHandler;
    }

    public Object getDynamicProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocationHandler);
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public InvocationHandler getInvocationHandler() {
        return invocationHandler;
    }

    public void setInvocationHandler(InvocationHandler invocationHandler) {
        this.invocationHandler = invocationHandler;
    }
}
