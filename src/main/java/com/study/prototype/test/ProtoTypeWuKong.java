package com.study.prototype.test;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class ProtoTypeWuKong {
    @Test
    public void test() {

        WuKong wuKong = new WuKong();
        wuKong.getId();
        WuKong clone = wuKong.clone();
        clone.getId();
        clone.getId();
        WuKong clone1 = wuKong.clone();
        clone1.getId();
        WuKong clone2 = wuKong.clone();
        clone2.getId();
        System.out.println(wuKong == clone1);

    }
}
