package com.study.structuralpattern.proxy.staticproxy;

/**
 * @author xiaomeng
 * @description
 * @date 2021/11/12
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标对象（被代理对象）
        ITeacherDao teacherDao = new TeacherDao();

        // 创建代理对象, 同时将被代理对象传递给代理对象
        ITeacherDao teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        // 通过代理对象调用被代理对象的方法
        teacherDaoProxy.teach();

    }
}
