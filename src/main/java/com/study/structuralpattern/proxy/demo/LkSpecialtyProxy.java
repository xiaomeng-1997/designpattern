package com.study.structuralpattern.proxy.demo;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class LkSpecialtyProxy {

    @Test
    public void test(){
        YfProxy yfProxy = new YfProxy();
        yfProxy.display();
    }
}
