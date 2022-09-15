package com.jinsu.design.pattern.strategy;

/**
 * @author lxy-beichen
 * @date 2022年09月15日 12:39:31
 */
public enum ServiceEnum {

    ONE(1),
    TWO(2);

    private int type;

    ServiceEnum(int type){
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
