package com.study.creationalpattern.prototype.test;

import com.study.creationalpattern.prototype.Realizetype;
import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class PrototypeTest {

    @Test
    public void test() throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        Realizetype clone = (Realizetype) realizetype.clone();

        System.out.println(realizetype == clone);


    }

}
