package com.oneapm.generic;

/**
 * Created by Lpp on 2016/3/24.
 */

class MyList<T>{
    private T[] arr ;
    public MyList(int length){
        this.arr = (T[])new Object[length] ;
    }
    public void add(T element){

    }

    public void remove(T element){

    }
    public void remove(int index){

    }

    public <U> U Convert(T element){
        return (U) element.toString() ;
    }
}
public class GenericTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(10) ;
        list.add(1);
        list.remove(0);
        list.remove(1);

        String str = list.Convert(10) ;
    }
}
