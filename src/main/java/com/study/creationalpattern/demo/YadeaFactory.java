package com.study.creationalpattern.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class YadeaFactory implements BicycleFactory{
    @Override
    public Bicycle produce() {
        System.out.println("雅迪工厂生产了一辆雅迪电动车...");
        return new YadeaBicycle();
    }
}
