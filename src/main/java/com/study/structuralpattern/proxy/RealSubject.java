package com.study.structuralpattern.proxy;

/**
 * @author xiaomeng
 * @description /真实主题
 * @date 2021/10/14
 */
public class RealSubject implements Subject{
    @Override
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
