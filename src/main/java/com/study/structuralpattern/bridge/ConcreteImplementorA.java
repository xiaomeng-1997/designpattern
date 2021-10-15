package com.study.structuralpattern.bridge;

/**
 * @author xiaomeng
 * @description 具体实现化角色A
 * @date 2021/10/14
 */
public class ConcreteImplementorA implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
