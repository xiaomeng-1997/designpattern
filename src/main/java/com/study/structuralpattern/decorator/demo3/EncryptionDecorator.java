package com.study.structuralpattern.decorator.demo3;

import java.util.Base64;

/**
 * @author xiaomeng
 * @description 加密装饰
 * @date 2021/10/15
 */
public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte)1;
        }
        return new String(result);
    }
}
