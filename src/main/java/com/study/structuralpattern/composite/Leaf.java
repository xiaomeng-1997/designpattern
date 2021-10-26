package com.study.structuralpattern.composite;

/**
 * @author xiaomeng
 * @description 叶节点
 * @date 2021/10/15
 */
public class Leaf implements Component{
    @Override
    public void execute() {
        System.out.println("完成一些工作");
    }
}
