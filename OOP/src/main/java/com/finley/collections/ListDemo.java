package com.finley.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Lpp on 2016/3/23.
 * Purpose: List基本测试
 */
public class ListDemo {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>() ;
        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(1) ;
        collection2.add(2) ;

        for (int i = 1 ;i < 5 ;++i){
            collection.add(i) ;
        }
        if(collection.contains(1)){
            System.out.println("Collection Contains 1");
        }
        if(collection.containsAll(collection2)){
            System.out.println("Collection Contains collection2");
        }

        collection.removeAll(collection2) ;
        Iterator<Integer> ite = collection.iterator() ;
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
