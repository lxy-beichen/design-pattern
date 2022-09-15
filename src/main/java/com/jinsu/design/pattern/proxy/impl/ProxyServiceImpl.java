package com.jinsu.design.pattern.proxy.impl;

import com.jinsu.design.pattern.proxy.ProxyService;

/**
 * @author lxy-beichen
 * @date 2022年09月15日 22:14:00
 */
public class ProxyServiceImpl implements ProxyService {

    @Override
    public void doSomeThing() {
        System.out.println("我是ProxyServiceImpl");
    }

}
