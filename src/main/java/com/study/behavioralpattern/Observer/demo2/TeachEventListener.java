package com.study.behavioralpattern.Observer.demo2;

/**
 * @author xiaomeng
 * @description 老师事件监听器
 * @date 2021/10/26
 */
public class TeachEventListener implements BellEventListener{

    @Override
    public void headBell(RingEvent e) {
        if (e.isSound()) {
            System.out.println("老师上课了...");
        } else {
            System.out.println("老师下课了...");
        }
    }
}
