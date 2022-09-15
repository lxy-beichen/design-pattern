package com.jinsu.design.pattern.chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author lxy-beichen
 * @date 2022年09月15日 13:17:46
 */
@Component
public class ChainPattern {

    @Autowired
    private List<AbstractHandler> abstractHandlerList;

    private AbstractHandler abstractHandler;

    @PostConstruct
    public void initializeChainFilter() {
        for (int i = 0; i < abstractHandlerList.size(); i++) {
            if (i == 0) {
                abstractHandler = abstractHandlerList.get(0);
            } else {
                AbstractHandler currentHandler = abstractHandlerList.get(i - 1);
                AbstractHandler nextHandler = abstractHandlerList.get(i);
                currentHandler.setNextHandler(nextHandler);
            }
        }
    }

    /**
     * 执行方法
     */
    public void exec(){
        abstractHandler.filter();
    }

}
