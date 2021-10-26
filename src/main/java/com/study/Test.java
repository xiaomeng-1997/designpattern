package com.study;

/**
 * @author xiaomeng
 * @description
 * @date 2021/10/22
 */
public class Test {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        String md5code = "12e3456789";
        int t = 32 - md5code.length();
        for (int i = 0; i < 32 - md5code.length(); i++) {
            stringBuffer.append("0");
        }
        System.out.println(stringBuffer.append(md5code));

    }
}
