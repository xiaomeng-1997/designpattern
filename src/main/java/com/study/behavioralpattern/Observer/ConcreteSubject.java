package com.study.behavioralpattern.Observer;

/**
 * @author xiaomeng
 * @description 具体目标
 * @date 2021/10/26
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变....");
        System.out.println("------------------");

        for (Observer observer : observers) {
            observer.response();
        }

    }
}
