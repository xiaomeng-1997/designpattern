package com.study.structuralpattern.adapter.demo;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class Client {

    @Test
    public void classAdapter(){
        System.out.println("适配器模式测试：");
        Motor motor2 = new ElectricAdapter();
        motor2.drive();
        System.out.println("适配器模式测试：");
        Motor motor1 = new OpticalAdapter();
        motor1.drive();
    }

    @Test
    public void objectAdapter() {
        System.out.println("适配器模式测试：");
        ElectricMotor electricMotor = new ElectricMotor();
        Electric2Adapter electric2Adapter = new Electric2Adapter(electricMotor);
        electric2Adapter.drive();
        System.out.println("适配器模式测试：");
        OpticalMotor opticalMotor = new OpticalMotor();
        Optical2Adapter optical2Adapter = new Optical2Adapter(opticalMotor);
        optical2Adapter.drive();
    }
}
