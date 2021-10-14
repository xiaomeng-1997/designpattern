package com.study.structuralpattern.adapter.demo;

/**
 * @author xiaomeng
 * @description 对象适配
 * @date 2021/10/14
 */
public class Electric2Adapter implements Motor{

    private ElectricMotor electricMotor;

    public Electric2Adapter(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }

    @Override
    public void drive() {
        electricMotor.electricDrive();
    }
}
