package com.study.behavioralpattern.Observer.demo2;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/26
 */
public class BellEventTest {
    public static void main(String[] args) {
        BellEventSource bell = new BellEventSource();
        bell.addPersonListener(new TeachEventListener());
        bell.addPersonListener(new StuEventListener());
        bell.ring(true);
        System.out.println("-------------");
        bell.ring(false);

    }
}
