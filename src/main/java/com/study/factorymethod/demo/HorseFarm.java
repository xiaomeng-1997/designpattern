package com.study.factorymethod.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class HorseFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        System.out.println("看见一只马...");
        return new Horse();
    }
}
