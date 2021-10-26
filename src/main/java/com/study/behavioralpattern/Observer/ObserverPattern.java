package com.study.behavioralpattern.Observer;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/26
 */
public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyObserver();
        subject.remove(observer2);
        subject.notifyObserver();
    }
}
