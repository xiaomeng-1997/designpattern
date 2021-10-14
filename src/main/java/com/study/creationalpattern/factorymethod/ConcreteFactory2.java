package com.study.creationalpattern.factorymethod;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2 -> 具体产品2...");
        return new ConcreteProduct2();
    }
}
