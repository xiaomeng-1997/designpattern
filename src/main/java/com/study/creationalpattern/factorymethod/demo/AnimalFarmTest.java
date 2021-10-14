package com.study.creationalpattern.factorymethod.demo;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class AnimalFarmTest {
    @Test
    public void test(){
       AnimalFarm horseFarm =  new HorseFarm();
        Animal horse = horseFarm.newAnimal();
        horse.show();
    }
}
