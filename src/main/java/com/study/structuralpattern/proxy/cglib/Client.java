package com.study.structuralpattern.proxy.cglib;

/**
 * @author xiaomeng
 * @description
 * @date 2021/11/12
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();

        proxyInstance.teach();
    }
}
