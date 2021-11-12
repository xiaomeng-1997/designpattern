package com.study.structuralpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xiaomeng
 * @description
 * @date 2021/11/12
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回一个代理对象 是 target 对象的代理对象
    public Object getProxyInstance() {
        //1.创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * @param o “this”，增强对象
     * @param method 拦截方法
     * @param args 参数数组； 原始类型被包装
     * @param methodProxy 用于调用 super（非拦截方法）； 可以根据需要多次调用
     */
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib 代理模式 开始。。。");
        Object invoke = method.invoke(target, args);
        System.out.println("cglib 代理模式 结束。。。");
        return invoke;
    }
}
