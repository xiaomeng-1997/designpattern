package com.study.structuralpattern.bridge;

/**
 * @author xiaomeng
 * @description 扩展抽象化角色
 * @date 2021/10/14
 */
public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.operationImpl();
    }
}
