package com.study.factorymethod;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public Product newProduct() {
        System.out.println("具体工厂1 -> 具体产品1...");
        return new ConcreteProduct1();
    }
}
