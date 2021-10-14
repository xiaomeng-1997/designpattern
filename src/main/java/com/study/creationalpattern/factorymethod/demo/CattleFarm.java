package com.study.creationalpattern.factorymethod.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class CattleFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        System.out.println("牛场到了...");
        return new Cattle();
    }
}
