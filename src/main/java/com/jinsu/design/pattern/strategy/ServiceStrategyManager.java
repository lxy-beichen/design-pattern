package com.jinsu.design.pattern.strategy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 服务策略管理器
 *
 * @author lxy-beichen
 * @date 2022年09月15日 12:48:11
 */
@Component
public class ServiceStrategyManager implements ApplicationContextAware {

    private final Map<ServiceEnum, ServiceStrategy> serviceStrategyMap = new ConcurrentHashMap<>();

    public void resolveService(ServiceEnum serviceEnum) {
        ServiceStrategy serviceStrategy = serviceStrategyMap.get(serviceEnum);
        if (Objects.nonNull(serviceStrategy)) {
            serviceStrategy.resolve();
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, ServiceStrategy> beans = applicationContext.getBeansOfType(ServiceStrategy.class);
        beans.values().forEach(serviceStrategy -> serviceStrategyMap.put(serviceStrategy.getServiceType(), serviceStrategy));
    }
}
