package com.study.behavioralpattern.Observer.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/26
 */
public class RMBrate extends Rate{
    @Override
    public void change(int number) {
        for (Company company : companies) {
            company.response(number);
        }
    }
}
