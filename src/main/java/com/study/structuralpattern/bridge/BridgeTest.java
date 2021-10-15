package com.study.structuralpattern.bridge;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class BridgeTest {

    @Test
    public void test(){
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.operation();
    }

}
