package com.study.behavioralpattern.ChainOfResponsibility.demo;

/**
 * 角色1：处理者：是一个接口，负责规定具体处理者处理用户请求的方法以及具体处理者设置后继对象的方法
 */
public interface Handler {

    // 具体处理用户请求 60 钻石抽一次还是 270 钻石抽五次
    public abstract void handlerRequest(int number);

    public abstract void setNextHandler(Handler handler);

}
