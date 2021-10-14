package com.study.creationalpattern.abstractfactory.demo;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class test {
    @Test
    public void test(){
        System.out.println("lk农场");
        Farm lKfram = new LKfram();
        Animal animal = lKfram.newAnimal();
        animal.show();
        Plant plant = lKfram.newPlant();
        plant.show();
        System.out.println("yf农场");
        Farm yFfram = new YFfram();
        Animal animal1 = yFfram.newAnimal();
        animal1.show();
        Plant plant1 = yFfram.newPlant();
        plant1.show();
    }
}
