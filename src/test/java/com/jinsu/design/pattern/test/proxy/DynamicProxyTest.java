package com.jinsu.design.pattern.test.proxy;

import com.jinsu.design.pattern.proxy.ProxyService;
import com.jinsu.design.pattern.proxy.dynamic.DynamicProxyInvocation;
import com.jinsu.design.pattern.proxy.dynamic.DynamicProxyService;
import com.jinsu.design.pattern.proxy.impl.ProxyServiceImpl;

import java.lang.reflect.Proxy;

/**
 * 动态代理测试
 *
 * @author lxy-beichen
 * @date 2022年09月15日 22:21:20
 */
public class DynamicProxyTest {

    public static void main(String[] args) {

        // 方法一
        System.out.println("============ 方法一 ==============");
        ProxyService proxyService = new ProxyServiceImpl();
        System.out.println("代理的目标对象：" + proxyService.getClass());
        DynamicProxyInvocation dynamicProxyInvocation = new DynamicProxyInvocation(proxyService);
        ProxyService proxy = (ProxyService) new DynamicProxyService(proxyService, dynamicProxyInvocation).getDynamicProxy();
        System.out.println("代理对象：" + proxy.getClass());
        proxy.doSomeThing();

        //方法二
        System.out.println("============ 方法二 ==============");
        ProxyService target = new ProxyServiceImpl();
        DynamicProxyInvocation invocation = new DynamicProxyInvocation(target);
        ProxyService proxy2 = (ProxyService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocation);
        System.out.println("代理对象：" + proxy2.getClass());
        proxy2.doSomeThing();


        //方法三
        System.out.println("============ 方法三 ==============");
        final ProxyService target3 = new ProxyServiceImpl();
        ProxyService proxy3 = (ProxyService) Proxy.newProxyInstance(target3.getClass().getClassLoader(), target3.getClass().getInterfaces(), (proxy1, method, args1) -> {
            System.out.println("StaticProxyService start");
            Object obj = method.invoke(target3, args1);
            System.out.println("StaticProxyService end");
            return obj;
        });
        System.out.println("返回对象：" + proxy3.getClass());
        proxy3.doSomeThing();

    }

}
