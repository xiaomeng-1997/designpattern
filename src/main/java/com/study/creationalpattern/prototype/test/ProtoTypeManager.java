package com.study.creationalpattern.prototype.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaomeng
 * @description
 * @date 2021/9/30
 */
public class ProtoTypeManager {

    private Map<String, Shape> map = new HashMap<>();

    public ProtoTypeManager() {
        map.put("Circle", new Circle());
        map.put("Square", new Square());
    }

    public void addShape(String key, Shape shape){
        map.put(key, shape);
    }

    public Shape getShape(String key){
        Shape shape = map.get(key);
        return  (Shape) shape.clone();
    }


}
