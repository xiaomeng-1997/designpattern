package com.study.structuralpattern.adapter;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {
        specificRequest();
    }
}
