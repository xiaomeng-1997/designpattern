package com.study.creationalpattern.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class TailgFacory implements BicycleFactory{
    @Override
    public Bicycle produce() {
        System.out.println("台铃工厂生产了一辆台铃电动车...");
        return new TailgBicycle();
    }
}
