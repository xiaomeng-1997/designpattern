package com.study.structuralpattern.decorator.demo;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/15
 */
public class HuTaoTest {

    @Test
    public void test(){
        HuTao hutao = new Original();
        hutao.display();

        Changer hallMaster = new HallMaster(hutao);
        hallMaster.display();

        Changer girl = new Girl(hutao);
        girl.display();

    }
}
