package com.jinsu.design.pattern.test.proxy;

import com.jinsu.design.pattern.proxy.impl.JdkProxyServiceImpl;
import com.jinsu.design.pattern.proxy.staticProxy.StaticProxyService;

/**
 * 静态代理测试
 *
 * @author lxy-beichen
 * @date 2022年09月15日 22:19:38
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        StaticProxyService staticProxyService = new StaticProxyService(new JdkProxyServiceImpl());
        staticProxyService.doSomeThing();
    }

}
