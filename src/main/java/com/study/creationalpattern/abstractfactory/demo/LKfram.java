package com.study.creationalpattern.abstractfactory.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class LKfram implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜能吃了");
        return new Vegetables();
    }
}
