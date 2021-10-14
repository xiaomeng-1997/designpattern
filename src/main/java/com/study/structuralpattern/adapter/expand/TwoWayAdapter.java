package com.study.structuralpattern.adapter.expand;

/**
 * @author xiaomeng
 * @description 双向适配器
 * @date 2021/10/14
 */
public class TwoWayAdapter implements TwoWayTarget,TwoWayAdaptee{

    private TwoWayTarget target;

    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    @Override
    public void specificRequest() {
        target.request();
    }
}
