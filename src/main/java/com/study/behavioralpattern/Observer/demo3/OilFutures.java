package com.study.behavioralpattern.Observer.demo3;

import java.util.Observable;

/**
 * @author xiaomeng
 * @description 原油期货
 * @date 2021/10/26
 */
public class OilFutures extends Observable {
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        super.setChanged();
        super.notifyObservers(price);
        this.price = price;
    }
}
