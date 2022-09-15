package com.jinsu.design.pattern.test.proxy;

import com.jinsu.design.pattern.proxy.CglibProxyService;
import com.jinsu.design.pattern.proxy.dynamic.cglib.CglibProxyInterceptor;

/**
 * cglib代理测试
 *
 * @author lxy-beichen
 * @date 2022年09月15日 23:10:25
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        CglibProxyInterceptor proxy = new CglibProxyInterceptor();
        //通过生成子类的方式创建代理类
        CglibProxyService proxyService = (CglibProxyService)proxy.getProxy(CglibProxyService.class);
        proxyService.doSomeThing();
    }

}
