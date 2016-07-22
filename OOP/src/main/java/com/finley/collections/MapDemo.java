package com.finley.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Lpp on 2016/3/23.
 */
public class MapDemo {

    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("first", "1");
        map.put("second", "2");
        map.put("third", "3");

        Set<String> keySet = map.keySet();
        for (Object element : keySet) {
            System.out.print(element + " ");
        }
        System.out.println();

        Collection<Object> values = map.values();
        for (Object element : values) {
            System.out.print(element + " ");
        }
        System.out.println();

        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        for (Map.Entry<String, Object> entry : entrySet) {
            System.out.println("key:" + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
