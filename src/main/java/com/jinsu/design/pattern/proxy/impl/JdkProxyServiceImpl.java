package com.jinsu.design.pattern.proxy.impl;

import com.jinsu.design.pattern.proxy.JdkProxyService;

/**
 * @author lxy-beichen
 * @date 2022年09月15日 22:14:00
 */
public class JdkProxyServiceImpl implements JdkProxyService {

    @Override
    public void doSomeThing() {
        System.out.println("我是JdkProxyServiceImpl");
    }

}
