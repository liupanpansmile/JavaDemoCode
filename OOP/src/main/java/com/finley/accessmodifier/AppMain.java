package com.finley.accessmodifier;

/**
 * Created by Administrator on 2016/3/22.
 * Purpose:
 * 类修饰符:        public    -> 在所有的地方都能访问
 *                  默认      -> 在同一包内被访问
 *方法/属性修饰符 ：public    -> 在所有的地方都能访问(前提是类能访问)
 *                  protected -> 在同一包内及不同包的子类中
 *                  default   -> 在同一包内
 *                  private   -> 在同一类中
 */

 class MyClass{
    private int privateVar;
    int defaultVar ;
    protected int protectedVar ;
    public int publicVar ;

    private void privateMethod(){
    }

    protected void protectedMethod(){
    }

    void defaultMethod(){
    }

    public void publicMethod(){
    }
}

public class AppMain {
    public static void main(String[] args) {
        MyClass instance = new MyClass() ;
        int var = instance.defaultVar ;
        var = instance.protectedVar ;
        var  = instance.publicVar ;

        instance.defaultMethod();
        instance.protectedMethod();
        instance.publicMethod();


    }
}
