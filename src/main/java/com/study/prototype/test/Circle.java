package com.study.prototype.test;

import java.util.Scanner;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class Circle implements Shape {
    @Override
    public Object clone() {
        Circle circle = null;

        try {
            circle = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("复制失败");
            e.printStackTrace();
        }
        return circle;
    }

    @Override
    public void countArea(int r) {
        System.out.println("这是一个圆，请输入圆的半径：");
        System.out.println("该圆的面积=" + 3.1415 * r * r + "\n");
    }
}
