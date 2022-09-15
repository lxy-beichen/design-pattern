package com.jinsu.design.pattern.strategy;

/**
 * 策略模式接口
 *
 * @author lxy-beichen
 * @date 2022年09月15日 12:38:43
 */
public interface ServiceStrategy {

    /**
     * 服务类型
     *
     * @return {@link ServiceEnum}
     */
    ServiceEnum getServiceType();


    /**
     * 实现逻辑
     */
    void resolve();

}
