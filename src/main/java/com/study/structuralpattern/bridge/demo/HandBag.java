package com.study.structuralpattern.bridge.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/15
 */
public class HandBag extends Bag{
    @Override
    public void getName() {

        System.out.println(color.getColor() + " HandBag");
    }
}
