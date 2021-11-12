package com.study.structuralpattern.proxy.cglib;

/**
 * @author xiaomeng
 * @description
 * @date 2021/11/12
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中,我是cglib代理，不需要实现接口....");
    }
}
