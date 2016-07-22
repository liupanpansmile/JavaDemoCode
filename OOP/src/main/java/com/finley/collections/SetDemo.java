package com.finley.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lpp on 2016/3/23.
 */

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>() ;
        boolean r1 = intSet.add(10) ;
        boolean r2 = intSet.add(10) ;
        System.out.println(r1);
        System.out.println(r2);
    }
}
