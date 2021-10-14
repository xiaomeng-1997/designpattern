package com.study.creationalpattern.abstractfactory.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class YFfram implements Farm{
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果熟了");
        return new Fruitage();
    }
}
