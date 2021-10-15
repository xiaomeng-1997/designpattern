package com.study.structuralpattern.bridge.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/15
 */
public class Red implements Color{
    @Override
    public String getColor() {
//        System.out.println("红色");
        return "red";
    }
}
