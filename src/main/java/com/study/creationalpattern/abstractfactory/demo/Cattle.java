package com.study.creationalpattern.abstractfactory.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class Cattle implements Animal{
    @Override
    public void show() {
        System.out.println("一头牛");
    }
}
