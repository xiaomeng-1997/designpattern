package com.study.structuralpattern.decorator.demo3;

/**
 * @author xiaomeng
 * @description 抽象基础装饰
 * @date 2021/10/15
 */
public class DataSourceDecorator implements DataSource{

    private DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
