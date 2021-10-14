package com.study.creationalpattern.simplefactory.test;

import com.study.creationalpattern.simplefactory.Product;
import com.study.creationalpattern.simplefactory.SimpleFactory;
import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class SimpleFactoryTest {

    @Test
    public void test() {

        Product product = SimpleFactory.makeProduct(0);
        Product product2 = SimpleFactory.makeProduct(1);
        product.show();
        product2.show();
    }
}
