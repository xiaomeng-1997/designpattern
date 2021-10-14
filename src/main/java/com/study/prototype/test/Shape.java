package com.study.prototype.test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
interface Shape extends Cloneable {

    public Object clone();

    public void countArea(int a);
}
