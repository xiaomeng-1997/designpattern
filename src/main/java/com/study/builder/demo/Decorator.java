package com.study.builder.demo;

/**
 * @author xiaomeng
 * @description 抽象建造者：装修工人
 * @date 2021/10/14
 */
abstract class Decorator {
    //创建产品对象
    protected Parlour parlour = new Parlour();

    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();

    //返回产品对象
    public Parlour getResult(){
        return parlour;
    }

}
