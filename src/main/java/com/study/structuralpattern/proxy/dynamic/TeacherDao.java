package com.study.structuralpattern.proxy.dynamic;

/**
 * @author xiaomeng
 * @description
 * @date 2021/11/12
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中....");
    }

    @Override
    public void show(String name) {
        System.out.println("name = " + name);
    }


}
