package com.study.prototype.test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class Citation implements Cloneable {

    private String name;
    private String info;
    private String college;

    public Citation(String name, String info, String college) {
        this.name = name;
        this.info = info;
        this.college = college;
        System.out.println("奖状创建成功");
    }

    public void getMessage() {
        System.out.println(name + info + college);
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功");
        return (Citation) super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setCollege(String college) {
        this.college = college;
    }

}
