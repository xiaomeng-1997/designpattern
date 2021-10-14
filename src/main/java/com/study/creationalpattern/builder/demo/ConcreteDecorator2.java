package com.study.creationalpattern.builder.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class ConcreteDecorator2 extends Decorator{
    @Override
    public void buildWall() {
        parlour.setWall("w2");
    }

    @Override
    public void buildTV() {
        parlour.setTV("TV2");
    }

    @Override
    public void buildSofa() {
        parlour.setSofa("sf2");
    }
}
