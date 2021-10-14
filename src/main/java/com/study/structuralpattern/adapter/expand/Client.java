package com.study.structuralpattern.adapter.expand;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class Client {

    @Test
    public void test(){
        System.out.println("目标通过双向适配器访问适配者：");
        TwoWayAdaptee adaptee = new AdapteeRealize();
        TwoWayTarget target = new TwoWayAdapter(adaptee);
        target.request();
        System.out.println("-------------------");
        System.out.println("适配者通过双向适配器访问目标：");
        target=new TargetRealize();
        adaptee=new TwoWayAdapter(target);
        adaptee.specificRequest();



    }

}
