package com.jinsu.design.pattern.proxy.staticProxy;

import com.jinsu.design.pattern.proxy.JdkProxyService;

/**
 * 静态代理类
 *
 * @author lxy-beichen
 * @date 2022年09月15日 22:12:53
 */
public class StaticProxyService {

    private JdkProxyService proxyService;

    public StaticProxyService(JdkProxyService proxyService) {
        this.proxyService = proxyService;
    }

    public void doSomeThing() {
        System.out.println("StaticProxyService start");
        proxyService.doSomeThing();
        System.out.println("StaticProxyService end");
    }

}
