package com.jinsu.design.pattern.strategy.impl;

import com.jinsu.design.pattern.strategy.ServiceEnum;
import com.jinsu.design.pattern.strategy.ServiceStrategy;
import org.springframework.stereotype.Component;

/**
 * @author lxy-beichen
 * @date 2022年09月15日 12:44:31
 */
@Component
public class TwoStrategyImpl implements ServiceStrategy {
    @Override
    public ServiceEnum getServiceType() {
        return ServiceEnum.TWO;
    }

    @Override
    public void resolve() {
        System.out.println("resolve TwoStrategyImpl");
    }
}
