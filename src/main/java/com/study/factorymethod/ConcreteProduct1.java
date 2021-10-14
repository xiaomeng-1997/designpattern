package com.study.factorymethod;

/**
 * @author xiaomeng
 * @description 具体产品
 * @date 2021/9/30
 */
public class ConcreteProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示....");
    }
}
