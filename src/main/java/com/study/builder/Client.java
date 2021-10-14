package com.study.builder;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description 客户类。
 * @date 2021/10/14
 */
public class Client {

    @Test
    public void test(){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }

}
