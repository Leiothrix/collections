package com.huacloud.list.query;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by adam on 2019/3/27 at 16:48.
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class QueryTest {

    private long linked(){
        Random random = new Random();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i = 0; i < 100000; i++){
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            int j = random.nextInt(i + 1);
            linkedList.get(j);
        }

        long end = System.currentTimeMillis();

        return (end - start);
    }

    private long array(){
        Random random = new Random();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < 100000; i++){
            arrayList.add(i);
        }

        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            int j = random.nextInt(i + 1);
            arrayList.get(j);
        }

        long end = System.currentTimeMillis();

        return (end - start);
    }

    public static void main(String[] args) {
        QueryTest queryTest = new QueryTest();
        System.out.println("LinkedList:" + queryTest.linked() + "ms");
        System.out.println("ArrayList:" + queryTest.array() + "ms");
    }
}
