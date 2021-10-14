package com.study.factorymethod;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class AbstractFactoryTest {

    @Test
    public void test(){
        AbstractFactory factory1 = new ConcreteFactory1();
        Product product1 = factory1.newProduct();
        product1.show();
        AbstractFactory factory2 = new ConcreteFactory2();
        Product product2 = factory2.newProduct();
        product2.show();
    }
}
