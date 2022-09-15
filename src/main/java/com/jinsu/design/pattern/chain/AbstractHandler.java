package com.jinsu.design.pattern.chain;

import java.util.Objects;

/**
 * 责任链模式抽象类
 *
 * @author lxy-beichen
 * @date 2022年09月15日 13:06:53
 */
public abstract class AbstractHandler {

    /**
     * 下一个链
     */
    private AbstractHandler nextHandler;

    public void filter() {
        doFilter();
        AbstractHandler nextHandler = getNextHandler();
        if (Objects.nonNull(nextHandler)) {
            nextHandler.filter();
        }
    }

    public AbstractHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 执行方法
     */
    public abstract void doFilter();
}
