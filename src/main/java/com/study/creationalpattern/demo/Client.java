package com.study.creationalpattern.demo;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/14
 */
public class Client {

    @Test
    public void test(){
        BicycleFactory aimaFactory = new AimaFactory();
        Bicycle produce = aimaFactory.produce();
        produce.show();



    }

}
