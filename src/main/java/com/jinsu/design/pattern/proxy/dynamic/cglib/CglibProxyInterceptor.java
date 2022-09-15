package com.jinsu.design.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理
 *
 * @author lxy-beichen
 * @date 2022年09月15日 23:08:32
 */
public class CglibProxyInterceptor implements MethodInterceptor {

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class<?> clazz){
        //设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return enhancer.create();
    }

    public Enhancer getEnhancer() {
        return enhancer;
    }

    public void setEnhancer(Enhancer enhancer) {
        this.enhancer = enhancer;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("CglibProxyInterceptor start");
        //通过代理类调用父类中的方法
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("CglibProxyInterceptor end");
        return result;
    }
}
