package com.study.behavioralpattern.Observer.demo2;

/**
 * @author xiaomeng
 * @description 学生事件监听器
 * @date 2021/10/26
 */
public class StuEventListener implements BellEventListener{
    @Override
    public void headBell(RingEvent e) {
        if (e.isSound()) {
            System.out.println("同学们，上课了...");
        } else {
            System.out.println("同学们，下课了...");
        }
    }
}
