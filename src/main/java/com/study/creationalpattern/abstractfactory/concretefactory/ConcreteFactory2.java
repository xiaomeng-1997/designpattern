package com.study.creationalpattern.abstractfactory.concretefactory;

import com.study.creationalpattern.abstractfactory.abstractfactory.AbstractFactory;
import com.study.creationalpattern.abstractfactory.concreteproduct.ConcreteProduct12;
import com.study.creationalpattern.abstractfactory.concreteproduct.ConcreteProduct22;
import com.study.creationalpattern.abstractfactory.product.Product1;
import com.study.creationalpattern.abstractfactory.product.Product2;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂 2 生成-->具体产品 12...");
        return new ConcreteProduct12();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂 2 生成-->具体产品 22...");
        return new ConcreteProduct22();
    }
}
