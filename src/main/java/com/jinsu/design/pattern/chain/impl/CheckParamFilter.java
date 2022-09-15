package com.jinsu.design.pattern.chain.impl;

import com.jinsu.design.pattern.chain.AbstractHandler;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author lxy-beichen
 * @date 2022年09月15日 13:13:50
 */
@Component
@Order(1)
public class CheckParamFilter extends AbstractHandler {

    @Override
    public void doFilter() {
        System.out.println("CheckParamFilter doFilter");
    }

}
