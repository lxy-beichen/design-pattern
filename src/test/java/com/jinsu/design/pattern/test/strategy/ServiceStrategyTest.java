package com.jinsu.design.pattern.test.strategy;

import com.jinsu.design.pattern.strategy.ServiceEnum;
import com.jinsu.design.pattern.strategy.ServiceStrategyManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 策略模式测试
 *
 * @author lxy-beichen
 * @date 2022年09月15日 12:54:48
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ServiceStrategyTest {

    @Autowired
    private ServiceStrategyManager serviceStrategyManager;

    @Test
    public void test() {

        serviceStrategyManager.resolveService(ServiceEnum.ONE);

        serviceStrategyManager.resolveService(ServiceEnum.TWO);
    }
}
