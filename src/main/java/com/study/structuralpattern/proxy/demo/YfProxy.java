package com.study.structuralpattern.proxy.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class YfProxy implements Specialty{

    private LkSpecialty lkSpecialty;

    @Override
    public void display() {
        if (lkSpecialty==null){
            lkSpecialty = new LkSpecialty();
        }
        preRequest();
        lkSpecialty.display();
        proRequest();
    }

    private void proRequest() {
        System.out.println("yf代理lk特产开始");
    }

    private void preRequest() {
        System.out.println("yf代理lk特产结束");
    }


}
