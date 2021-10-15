package com.study.structuralpattern.bridge.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/15
 */
public abstract class Bag {

    public Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract void getName();


}
