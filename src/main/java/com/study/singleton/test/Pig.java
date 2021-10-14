package com.study.singleton.test;

import java.util.UUID;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class Pig {

    private final UUID pidId =  UUID.randomUUID();

    private Pig() {
        System.out.println("生产一头猪" + pidId);
    }

    private static final Pig instance = new Pig();

    public static Pig getInstance(){

        return instance;
    }

    public void getPigName(){
        System.out.println("猪：编号" + pidId);
    }
}
