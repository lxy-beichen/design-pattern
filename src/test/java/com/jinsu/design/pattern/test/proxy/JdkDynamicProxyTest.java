package com.jinsu.design.pattern.test.proxy;

import com.jinsu.design.pattern.proxy.JdkProxyService;
import com.jinsu.design.pattern.proxy.dynamic.jdk.DynamicProxyInvocation;
import com.jinsu.design.pattern.proxy.dynamic.jdk.DynamicProxyService;
import com.jinsu.design.pattern.proxy.impl.JdkProxyServiceImpl;

import java.lang.reflect.Proxy;

/**
 * jdk动态代理测试
 *
 * @author lxy-beichen
 * @date 2022年09月15日 22:21:20
 */
public class JdkDynamicProxyTest {

    public static void main(String[] args) {

        // 方法一
        System.out.println("============ 方法一 ==============");
        JdkProxyService proxyService = new JdkProxyServiceImpl();
        System.out.println("代理的目标对象：" + proxyService.getClass());
        DynamicProxyInvocation dynamicProxyInvocation = new DynamicProxyInvocation(proxyService);
        JdkProxyService proxy = (JdkProxyService) new DynamicProxyService(proxyService, dynamicProxyInvocation).getDynamicProxy();
        System.out.println("代理对象：" + proxy.getClass());
        proxy.doSomeThing();

        //方法二
        System.out.println("============ 方法二 ==============");
        JdkProxyService target = new JdkProxyServiceImpl();
        DynamicProxyInvocation invocation = new DynamicProxyInvocation(target);
        JdkProxyService proxy2 = (JdkProxyService) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocation);
        System.out.println("代理对象：" + proxy2.getClass());
        proxy2.doSomeThing();


        //方法三
        System.out.println("============ 方法三 ==============");
        final JdkProxyService target3 = new JdkProxyServiceImpl();
        JdkProxyService proxy3 = (JdkProxyService) Proxy.newProxyInstance(target3.getClass().getClassLoader(), target3.getClass().getInterfaces(), (proxy1, method, args1) -> {
            System.out.println("StaticProxyService start");
            Object obj = method.invoke(target3, args1);
            System.out.println("StaticProxyService end");
            return obj;
        });
        System.out.println("返回对象：" + proxy3.getClass());
        proxy3.doSomeThing();

    }

}
