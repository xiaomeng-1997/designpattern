package com.study.creationalpattern.singleton;

/**
 * @author xiaomeng
 * @description 饿汉模式
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题。
 * @date 2021/9/30
 */
public class HungrySingleton {

    private HungrySingleton(){}

    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance(){

        return instance;
    }

}
