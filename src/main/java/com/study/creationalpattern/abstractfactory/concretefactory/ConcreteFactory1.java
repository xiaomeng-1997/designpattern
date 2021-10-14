package com.study.creationalpattern.abstractfactory.concretefactory;

import com.study.creationalpattern.abstractfactory.abstractfactory.AbstractFactory;
import com.study.creationalpattern.abstractfactory.concreteproduct.ConcreteProduct11;
import com.study.creationalpattern.abstractfactory.concreteproduct.ConcreteProduct21;
import com.study.creationalpattern.abstractfactory.product.Product1;
import com.study.creationalpattern.abstractfactory.product.Product2;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class ConcreteFactory1 implements AbstractFactory {
    @Override
    public Product1 newProduct1() {
        System.out.println("具体工厂 1 生成-->具体产品 11...");
        return new ConcreteProduct11();
    }

    @Override
    public Product2 newProduct2() {
        System.out.println("具体工厂 1 生成-->具体产品 21...");
        return new ConcreteProduct21();
    }
}
