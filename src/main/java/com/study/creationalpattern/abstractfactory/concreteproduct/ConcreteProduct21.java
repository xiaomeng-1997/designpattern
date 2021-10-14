package com.study.creationalpattern.abstractfactory.concreteproduct;

import com.study.creationalpattern.abstractfactory.product.Product1;
import com.study.creationalpattern.abstractfactory.product.Product2;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class ConcreteProduct21 implements Product2 {
    @Override
    public void show() {
        System.out.println("具体产品21");
    }
}
