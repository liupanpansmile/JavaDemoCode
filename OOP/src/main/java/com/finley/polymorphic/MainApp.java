package com.finley.polymorphic;

/**
 * Created by Administrator on 2016/3/22.
 * purpose: 测试多态性
 */

class A{
    public void show(D obj){
        System.out.println("A and D");
    }

    public void show(A obj){
        System.out.println("A and A");
    }
}
class B extends A{
    public void show(B obj){
        System.out.println("B and B");
    }

    public void show(A obj){
        System.out.println("B and A");
    }
}

class C extends B{}
class D extends B{}
public class MainApp {
    public static void main(String[] args) {

        A a1 = new A() ;
        A a2 = new B() ;
        B b = new B() ;
        C c = new C() ;
        D d = new D() ;
        a1.show(b) ;            // A and A
        a1.show(c) ;            // A and A
        a1.show(d) ;            // A and D
        a2.show(b) ;            // B and A
        a2.show(c) ;            // B and A
        a2.show(d) ;            // A and D
        b.show(b) ;             // B and B
        b.show(c) ;             // B and B
        b.show(d) ;             //A and D

    }
}
