package com.study.behavioralpattern.Observer.demo2;

import java.util.EventListener;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/26
 */
public interface BellEventListener extends EventListener {

    void headBell(RingEvent e);

}
