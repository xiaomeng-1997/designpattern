package com.study.structuralpattern.adapter.expand;

/**
 * @author xiaomeng
 * @description 适配者实现类
 * @date 2021/10/14
 */
public class AdapteeRealize implements TwoWayAdaptee {
    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }
}
