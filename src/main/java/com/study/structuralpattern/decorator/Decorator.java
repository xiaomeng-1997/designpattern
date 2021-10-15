package com.study.structuralpattern.decorator;

/**
 * @author xiaomeng
 * @description 抽象装饰角色
 * @date 2021/10/15
 */
public abstract class Decorator implements Component{

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
