package com.study.structuralpattern.bridge;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class ConcreteImplementorB implements Implementor{
    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
