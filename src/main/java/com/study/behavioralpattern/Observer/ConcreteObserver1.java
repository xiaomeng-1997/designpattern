package com.study.behavioralpattern.Observer;

/**
 * @author xiaomeng
 * @description 具体观察者1
 * @date 2021/10/26
 */
public class ConcreteObserver1 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}
