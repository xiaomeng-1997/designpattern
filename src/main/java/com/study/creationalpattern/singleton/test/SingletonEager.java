package com.study.creationalpattern.singleton.test;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class SingletonEager {

    @Test
    public void test() {

        Pig pig = Pig.getInstance();
        pig.getPigName();
        Pig pig1 = Pig.getInstance();
        pig1.getPigName();

        if (pig == pig1) {
            System.out.println("同一只猪");
        } else {
            System.out.println("不同只猪");
        }

    }

}
