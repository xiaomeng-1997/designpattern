package com.study.structuralpattern.decorator.demo1;

/**
 * @author xiaomeng
 * @description 具体装饰类
 * @date 2021/10/15
 */
public class ConcreteDecorators extends BaseDecorator{
    public ConcreteDecorators(Component wrappee) {
        super(wrappee);
    }

    @Override
    public void execute() {
        super.execute();
        extra();
    }

    private void extra() {

    }
}
