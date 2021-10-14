package com.study.structuralpattern.adapter.demo;

/**
 * @author xiaomeng
 * @description 类适配
 * @date 2021/10/14
 */
public class ElectricAdapter extends ElectricMotor implements Motor{
    @Override
    public void drive() {
        electricDrive();
    }
}
