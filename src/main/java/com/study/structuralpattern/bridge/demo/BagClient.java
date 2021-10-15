package com.study.structuralpattern.bridge.demo;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/15
 */
public class BagClient {
    @Test
    public void test(){
        Bag handBag = new HandBag();
        Color yellow = new Yellow();
        handBag.setColor(yellow);
        handBag.getName();
    }
}
