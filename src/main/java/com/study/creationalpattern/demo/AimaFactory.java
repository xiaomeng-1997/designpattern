package com.study.creationalpattern.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class AimaFactory implements BicycleFactory{
    @Override
    public Bicycle produce() {
        System.out.println("爱玛工厂生产一辆爱玛电动车..");
        return new AimaBicycle();
    }
}
