package com.study.creationalpattern.abstractfactory.client;

import com.study.creationalpattern.abstractfactory.abstractfactory.AbstractFactory;
import com.study.creationalpattern.abstractfactory.concretefactory.ConcreteFactory1;
import com.study.creationalpattern.abstractfactory.product.Product1;
import com.study.creationalpattern.abstractfactory.product.Product2;
import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class Client {

    @Test
    public void test(){
        AbstractFactory factory1 = new ConcreteFactory1();
        Product1 product11 = factory1.newProduct1();
        product11.show();
        Product2 product21 = factory1.newProduct2();
        product21.show();
        AbstractFactory factory2 = new ConcreteFactory1();
        Product1 product12 = factory2.newProduct1();
        product12.show();
        Product2 product22 = factory2.newProduct2();
        product12.show();
    }
}
