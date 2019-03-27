package com.huacloud.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by adam on 2019/3/27 at 17:32.
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> treeMap = new TreeMap<>();
        Map<String,String> linkedMap = new LinkedHashMap<>();

        treeMap.put("b",null);
        treeMap.put("c",null);
        treeMap.put("a",null);

        for (Iterator<String> iter = treeMap.keySet().iterator(); iter.hasNext();){
            System.out.println("TreeMap=" + iter.next());
        }

        System.out.println("----------分割线---------");

        linkedMap.put("b",null);
        linkedMap.put("c",null);
        linkedMap.put("a",null);

        for (Iterator<String> iter = linkedMap.keySet().iterator();iter.hasNext();){
            System.out.println("LinkedHashMap=" + iter.next());
        }
    }
}
