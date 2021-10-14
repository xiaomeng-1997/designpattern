package com.study.prototype;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class Realizetype implements Cloneable {
    public Realizetype() {
        System.out.println("原型模式创建成功");
    }

    @Override
    public Object clone() throws CloneNotSupportedException{

        System.out.println("具体原型复制成功");

        return super.clone();
    }

}
