package com.study.structuralpattern.decorator.demo3;

import java.io.*;

/**
 * @author xiaomeng
 * @description 简单数据读写器
 * @date 2021/10/15
 */
public class FileDataSource implements DataSource {

    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try {
            FileReader reader = new FileReader(file);
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return new String(buffer);

    }
}
