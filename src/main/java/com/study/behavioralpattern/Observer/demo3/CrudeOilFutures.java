package com.study.behavioralpattern.Observer.demo3;

import java.util.Observer;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/26
 */
public class CrudeOilFutures {
    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        Observer bull = new Bull();
        Observer bear = new Bear();
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-21);
    }
}
