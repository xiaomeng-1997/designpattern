package com.study.behavioralpattern.Observer.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/26
 */
public class RMBrateTest {
    public static void main(String[] args) {
        Rate rate = new RMBrate();
        Company importCompany = new ImportCompany();
        Company exportCompany = new ExportCompany();
        rate.add(importCompany);
        rate.add(exportCompany);
        rate.change(5);
        rate.change(-10);
    }
}
