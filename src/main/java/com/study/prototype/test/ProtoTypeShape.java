package com.study.prototype.test;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class ProtoTypeShape {

    @Test
    public void test(){
        ProtoTypeManager manager = new ProtoTypeManager();

        Circle circle = (Circle) manager.getShape("Circle");
        circle.countArea(2);

        Square square = (Square) manager.getShape("Square");
        square.countArea(3);


    }
}
