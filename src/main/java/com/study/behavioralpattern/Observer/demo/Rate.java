package com.study.behavioralpattern.Observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaomeng
 * @description 汇率
 * @date 2021/10/26
 */
public abstract class Rate {
    public List<Company> companies = new ArrayList<>();

    public void add(Company company){
        companies.add(company);
    }

    public void remove(Company company){
        companies.remove(company);
    }

    public abstract void change(int number);

}
