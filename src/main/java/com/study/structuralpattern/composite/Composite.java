package com.study.structuralpattern.composite;

import java.util.List;

/**
 * @author xiaomeng
 * @description 组合，容器
 * @date 2021/10/15
 */
public class Composite extends Leaf{

    private List<Component> children;

    @Override
    public void execute() {
        super.execute();
    }

    void add(Component component){

    }

    void remove(Component component){

    }

    void getChildren(Component component){

    }
}
