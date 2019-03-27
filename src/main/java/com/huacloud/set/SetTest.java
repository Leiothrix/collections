package com.huacloud.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by adam on 2019/3/27 at 17:30.
 * PS: You may say that I'm a dreamer.But I'm not the only one.
 */
public class SetTest {
    public static void main(String[] args) {
        Person adam = new Person("adam",10);
        Person adam2 = new Person("adam",10);
        Person paprika = new Person("paprika",20);

        ArrayList<Person> list = new ArrayList<>();
        list.add(adam);
        list.add(adam2);
        list.add(paprika);
        System.out.println("List size=" + list.size());

        System.out.println("---------------------------------------------");

        Set<Person> set = new HashSet<>();
        set.add(adam);
        set.add(adam2);
        set.add(paprika);
        System.out.println("Set size=" + set.size());
    }


    static class Person{
        private String name;
        private int age;

        private Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            System.out.println("Call equals();name=" + name);
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            return name.equals(person.name);

        }

        @Override
        public int hashCode() {
            System.out.println("Call hashCode(),age=" + age);
            return age;
        }


    }
}
