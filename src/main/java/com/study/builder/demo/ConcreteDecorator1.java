package com.study.builder.demo;

/**
 * @author xiaomeng
 * @description 具体建造者：具体装修工人1
 * @date 2021/10/14
 */
public class ConcreteDecorator1 extends Decorator{
    @Override
    public void buildWall() {
        parlour.setWall("w1");
    }

    @Override
    public void buildTV() {
        parlour.setTV("TV1");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("sf1");
    }
}
