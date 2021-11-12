package com.study.behavioralpattern.ChainOfResponsibility.demo;

/**
 * 角色2.3：具体处理者：具体处理者是实现处理者接口的类的实例
 * 具体处理者通过调用处理者接口规定的方法，处理用户的请求
 * 即在接到用户的请求后，处理者将调用接口规定的方法，在执行该方法的过程中
 * 如果发现能处理用户的请求，就处理有关数据
 * 否则就反馈无法处理的信息给用户，然后将用户的请求传递给自己的后继对象
 */
public class RareCrystalOfKings implements Handler{
    private Handler handler;
    @Override
    public void handlerRequest(int number) {
        if (number == 201){   // 幸运值满201时， 出稀有水晶
            System.out.println("【稀有】王者水晶");
        } else {
            handler.handlerRequest(number);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.handler = handler;
    }
}
