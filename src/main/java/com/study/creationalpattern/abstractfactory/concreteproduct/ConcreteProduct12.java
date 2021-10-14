package com.study.creationalpattern.abstractfactory.concreteproduct;

import com.study.creationalpattern.abstractfactory.product.Product1;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class ConcreteProduct12 implements Product1 {
    @Override
    public void show() {
        System.out.println("具体产品12");
    }
}
