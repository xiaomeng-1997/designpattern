package com.study.prototype.test;

import java.util.UUID;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class WuKong implements Cloneable{

    private UUID uuid = null;

    WuKong() {
        System.out.println("猴毛变猴子" + uuid);
    }

    @Override
    protected WuKong clone(){
        WuKong wuKong = null;
        try {
            uuid= UUID.randomUUID();
          wuKong = (WuKong) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("变猴失败");
        }
        return wuKong;
    }
    public void getId(){
        System.out.println(uuid);
    }

}
