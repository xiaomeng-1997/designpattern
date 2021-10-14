package com.study.creationalpattern.builder.demo;

/**
 * @author xiaomeng
 * @description 产品：客厅
 * @date 2021/10/14
 */
public class Parlour {

    private String wall; //墙
    private String TV; //电视
    private String sofa;  //沙发

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show(){
        System.out.println("建造者模式测试");
        String parlour = wall + TV + sofa;
        System.out.println(parlour);

    }
}
