package com.study.creationalpattern.singleton.test;

import java.util.UUID;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class President {

    private final UUID id =  UUID.randomUUID();

    private President() {
        System.out.println("产生一个总统" + id);
    }

    private static volatile President instance = null;

    public static synchronized President getInstance(){
        if (instance==null){
            instance = new President();
        } else {
            System.out.println("已经有一个总统了");
        }
        return instance;
    }

    public void getName(){
        System.out.println("总统：编号" + id);
    }

}
