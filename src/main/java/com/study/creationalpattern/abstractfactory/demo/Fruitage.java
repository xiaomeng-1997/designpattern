package com.study.creationalpattern.abstractfactory.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class Fruitage implements Plant{
    @Override
    public void show() {
        System.out.println("这是一颗果树");
    }
}
