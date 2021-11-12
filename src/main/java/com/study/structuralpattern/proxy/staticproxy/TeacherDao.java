package com.study.structuralpattern.proxy.staticproxy;

/**
 * @author xiaomeng
 * @description
 * @date 2021/11/12
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中.....");
    }
}
