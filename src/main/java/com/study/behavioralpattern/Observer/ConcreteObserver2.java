package com.study.behavioralpattern.Observer;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/26
 */
public class ConcreteObserver2 implements Observer{
    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}
