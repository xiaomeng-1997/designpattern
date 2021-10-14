package com.study.structuralpattern.adapter;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class AdapterTest {

    @Test
    public void classAdapterTest(){
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }

    @Test
    public void objectAdapter(){
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }

}
