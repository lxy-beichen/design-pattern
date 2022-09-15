package com.jinsu.design.pattern.chain.impl;

import com.jinsu.design.pattern.chain.AbstractHandler;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author lxy-beichen
 * @date 2022年09月15日 13:16:15
 */
@Component
@Order(2)
public class CheckSecurityFilter extends AbstractHandler {

    @Override
    public void doFilter() {
        System.out.println("CheckSecurityFilter  doFilter");
    }
}
