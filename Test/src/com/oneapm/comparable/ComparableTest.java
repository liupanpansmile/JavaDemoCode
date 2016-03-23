package com.oneapm.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Lpp on 2016/3/23.
 * Purpose: 比较Comparable Comparator区别
 * Comparable在类内进行比较，如下，实现compareTo(Person o)方法，在类实例中调用compareTo 方法
 * Comparator在类外进行比较，如下，实现int compare(Person o1, Person o2)方法,是一种策略模式，
 * 在不修改原有类的基础上，可以进行比较，排序
 */
class Person implements Comparable<Person> {

    private int age;
    private String name;

    public Person() {

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return String.format("%s %d", this.name, this.age);
    }
}

class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}

public class ComparableTest {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(25, "Jack"));
        list.add(new Person(21, "Mary"));
        list.add(new Person(22, "Lucy"));
        //list.sort(new PersonAgeComparator());
        Collections.sort(list);
        for (Person p : list) {
            System.out.println(p);
        }

    }
}
