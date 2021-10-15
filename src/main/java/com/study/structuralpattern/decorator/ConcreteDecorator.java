package com.study.structuralpattern.decorator;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/15
 */
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    public void addedFunction(){
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }
}
