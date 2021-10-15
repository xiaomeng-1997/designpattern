package com.study.structuralpattern.decorator.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/15
 */
public abstract class Changer implements HuTao{

    private HuTao hutao;

    public Changer(HuTao hutao) {
        this.hutao = hutao;
    }

    @Override
    public void display() {
        hutao.display();
    }


}
