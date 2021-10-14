package com.study.structuralpattern.adapter;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
