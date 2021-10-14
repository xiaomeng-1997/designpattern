package com.study.creationalpattern.prototype.test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class Square implements Shape {
    @Override
    public Object clone() {
        Shape shape = null;

        try {
            shape = (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("复制失败");
            e.printStackTrace();
        }
        return shape;
    }

    @Override
    public void countArea(int a) {
        System.out.println("这是一个正方形，请输入它的边长：");
        System.out.println("正方形面积：" + a * a);
    }
}
