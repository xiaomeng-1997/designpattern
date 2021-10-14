package com.study.structuralpattern.adapter;

/**
 * @author xiaomeng
 * @description //适配者接口
 * @date 2021/10/14
 */
public class Adaptee {
   public void specificRequest(){
       System.out.println("适配者中的业务代码被调用！");
   }
}
