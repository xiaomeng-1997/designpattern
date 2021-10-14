package com.study.creationalpattern.simplefactory;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class SimpleFactory {

    public static Product makeProduct(int kind){
        switch (kind){
            case Const.PRODUCT_A:
                return new ConcreteProduct1();
            case Const.PRODUCT_B:
                return new ConcreteProduct2();
        }
        return null;
    }

}
