package com.study.builder;

/**
 * @author xiaomeng
 * @description 指挥者：调用建造者中的方法完成复杂对象的创建。
 * @date 2021/10/14
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();

        return builder.getResult();
    }

}
