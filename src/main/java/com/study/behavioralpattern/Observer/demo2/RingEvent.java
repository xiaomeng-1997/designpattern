package com.study.behavioralpattern.Observer.demo2;

import java.util.EventObject;

/**
 * @author xiaomeng
 * @description 铃声事件
 * @date 2021/10/26
 */
public class RingEvent extends EventObject {
    private boolean sound;

    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
