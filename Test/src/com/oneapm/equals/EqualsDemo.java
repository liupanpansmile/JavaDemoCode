package com.oneapm.equals;

/**
 * Created by Lpp on 2016/3/23.
 * Purpose:比较 == 与equals区别
 * ==       ->  比较两个对象地址是否相同，是否指向同一对象
 * equals   -> 比较两个对象的类容是否相同. Object equals方法调用==
 *
 * String 中对equals进行重写，判断字符串内容是否相同
 */
public class EqualsDemo {

    public static void main(String[] args) {
        String a = new String("hello") ;
        String b = new String("hello") ;
        System.out.println(a == b);         //false
        System.out.println(a.equals(b));    //true

        a = "hello" ;       //box,自动装箱，hello放在字符串池中
        b = "hello" ;       //"hello"在字符串池中找到
        System.out.println(a == b);         //true
        System.out.println(a.equals(b));    //true
    }
}
