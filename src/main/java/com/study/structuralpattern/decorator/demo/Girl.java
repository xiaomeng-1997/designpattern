package com.study.structuralpattern.decorator.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/15
 */
public class Girl extends Changer{
    public Girl(HuTao hutao) {
        super(hutao);
    }

    @Override
    public void display() {
        setChange();
        super.display();
    }

    private void setChange() {
        System.out.println("少女---胡桃");
    }
}
