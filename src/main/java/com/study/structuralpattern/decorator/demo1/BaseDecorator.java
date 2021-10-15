package com.study.structuralpattern.decorator.demo1;

/**
 * @author xiaomeng
 * @description 基础装饰
 * @date 2021/10/15
 */
public class BaseDecorator implements Component{

    private Component wrappee;

    public BaseDecorator(Component wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void execute() {
        wrappee.execute();
    }
}
