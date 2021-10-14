package com.study.prototype.test;

import org.junit.jupiter.api.Test;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class ProtoTypeCitation {

    @Test
    public void test() throws CloneNotSupportedException {
        Citation citation = new Citation("张三", "三好学生", "软件学院");
        citation.getMessage();
        Citation citation1 = citation.clone();
        citation1.setName("李四");
        citation1.getMessage();

    }

}
