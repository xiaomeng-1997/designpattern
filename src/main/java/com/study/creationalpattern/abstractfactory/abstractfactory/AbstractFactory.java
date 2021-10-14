package com.study.creationalpattern.abstractfactory.abstractfactory;


import com.study.creationalpattern.abstractfactory.product.Product1;
import com.study.creationalpattern.abstractfactory.product.Product2;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public interface AbstractFactory {
    Product1 newProduct1();
    Product2 newProduct2();
}
