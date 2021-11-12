package com.study.structuralpattern.proxy.dynamic;

/**
 * @author xiaomeng
 * @description
 * @date 2021/11/12
 */
public class Client {
    public static void main(String[] args) {

        ITeacherDao target = new TeacherDao();

        ITeacherDao teacherDao = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        teacherDao.teach();

        teacherDao.show("张三");


    }
}
