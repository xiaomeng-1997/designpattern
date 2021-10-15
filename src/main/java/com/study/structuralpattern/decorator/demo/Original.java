package com.study.structuralpattern.decorator.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/15
 */
public class Original implements HuTao{

    public Original() {
        System.out.println("我叫胡桃");
    }

    @Override
    public void display() {
        System.out.println("展示");
    }
}
