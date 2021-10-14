package com.study.structuralpattern.adapter.demo;

/**
 * @author xiaomeng
 * @description 对象适配
 * @date 2021/10/14
 */
public class Optical2Adapter implements Motor{

    private OpticalMotor opticalMotor;

    public Optical2Adapter(OpticalMotor opticalMotor) {
        this.opticalMotor = opticalMotor;
    }

    @Override
    public void drive() {
        opticalMotor.opticalDrive();
    }
}
