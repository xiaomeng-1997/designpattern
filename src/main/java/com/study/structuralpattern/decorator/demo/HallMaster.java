package com.study.structuralpattern.decorator.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/15
 */
public class HallMaster extends Changer{
    public HallMaster(HuTao hutao) {
        super(hutao);
    }

    @Override
    public void display() {
        setChange();
        super.display();
    }

    private void setChange() {
        System.out.println("往生堂堂主----胡桃");
    }
}
