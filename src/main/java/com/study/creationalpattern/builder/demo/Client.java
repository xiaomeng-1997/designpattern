package com.study.creationalpattern.builder.demo;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class Client {

    @Test
    public void test(){
        Decorator decorator = new ConcreteDecorator1();
        ProjectManager projectManager = new ProjectManager(decorator);
        Parlour parlour = projectManager.decorate();
        parlour.show();
        Decorator decorator2 = new ConcreteDecorator2();
        ProjectManager projectManager2 = new ProjectManager(decorator2);
        Parlour parlour2 = projectManager2.decorate();
        parlour2.show();
    }
}
