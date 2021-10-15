package com.study.structuralpattern.bridge;

/**
 * @author xiaomeng
 * @description 抽象化角色
 * @date 2021/10/14
 */
public abstract class Abstraction {

    public Implementor imple;

    public Abstraction(Implementor imple) {
        this.imple = imple;
    }

    public abstract void operation();

}
