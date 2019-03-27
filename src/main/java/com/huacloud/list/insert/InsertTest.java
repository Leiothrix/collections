package com.huacloud.list.insert;

import java.util.LinkedList;
import java.util.ArrayList;

/**
 * Created by adam on 2019/3/27 at 16:48.
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class InsertTest {

    private long linked() {
        LinkedList<Integer> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }

        long end = System.currentTimeMillis();

        return (end - start);
    }

    private long array() {
        ArrayList<Integer> arrayList = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int j = 0; j < 100000; j++) {
            arrayList.add(0, j);
        }

        long end = System.currentTimeMillis();

        return (end - start);
    }

    public static void main(String[] args) {
        InsertTest insertTest = new InsertTest();
        System.out.println("LinkedList:" + insertTest.linked() + "ms");
        System.out.println("ArrayList:" + insertTest.array() + "ms");
    }
}
