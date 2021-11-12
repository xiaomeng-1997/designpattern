package com.study.behavioralpattern.ChainOfResponsibility.demo;

/**
 * @author xiaomeng
 * @description
 * @date 2021/11/1
 */
public class Application {
    private Handler diamond60,diamond270,rareDiamond;

    public void createChain(){
         diamond60 = new Diamond60DrawAPrize();
         diamond270 = new Diamond270DrawFivePrizes();
         rareDiamond = new RareCrystalOfKings();
         diamond60.setNextHandler(diamond270);
         diamond270.setNextHandler(rareDiamond);
    }
    public void responseClient(int number){
        diamond60.handlerRequest(number);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.createChain();
        System.out.println("当点击“60钻石”抽一次时：");
        System.out.print("[购买成功]");
        application.responseClient(60);
        System.out.println("---------------------");
        System.out.println("当点击”270钻石“抽五次时：");
        System.out.println("[购买成功]");
        application.responseClient(270);
        System.out.println("---------------------");
        System.out.println("当钻石抽奖“幸运值达201”时：");
        System.out.println("[购买成功]");
        application.responseClient(201);
    }
}
