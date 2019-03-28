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

    private void treeMap(){
        Map<String, String> treeMap = new TreeMap<>();

        treeMap.put("b", "0");
        treeMap.put("c", "1");
        treeMap.put("a", "2");

        Iterator<String> iterator = treeMap.keySet().iterator();

        for(; iterator.hasNext(); ){
            System.out.println("NextTreeMapElement = " + iterator.next());
        }
    }

    private void linkedMap(){
        Map<String, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put("b", "0");
        linkedMap.put("c", "1");
        linkedMap.put("a", "2");

        Iterator<String> iterator = linkedMap.keySet().iterator();

        for (; iterator.hasNext(); ){
            System.out.println("NextLinkedHashMapElement = " + iterator.next());
        }
    }
    public static void main(String[] args) {
        MapTest mapTest = new MapTest();
        mapTest.treeMap();
        System.out.println("------------------------------------------------");
        mapTest.linkedMap();
    }
}
