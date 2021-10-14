package com.study.structuralpattern.adapter.expand;

/**
 * @author xiaomeng
 * @description 目标实现类
 * @date 2021/10/14
 */
public class TargetRealize implements TwoWayTarget{
    @Override
    public void request() {
        System.out.println("目标代码被调用！");
    }
}
