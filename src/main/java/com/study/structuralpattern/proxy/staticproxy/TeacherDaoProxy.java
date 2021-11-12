package com.study.structuralpattern.proxy.staticproxy;

/**
 * @author xiaomeng
 * @description
 * @date 2021/11/12
 */
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理, 完成某些操作.....");
        target.teach();
        System.out.println("提交.....");
    }
}
