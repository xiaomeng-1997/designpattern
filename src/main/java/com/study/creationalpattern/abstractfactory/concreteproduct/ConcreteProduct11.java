package com.study.creationalpattern.abstractfactory.concreteproduct;

import com.study.creationalpattern.abstractfactory.product.Product;
import com.study.creationalpattern.abstractfactory.product.Product1;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class ConcreteProduct11 implements Product1 {
    @Override
    public void show() {
        System.out.println("具体产品11");
    }
}
