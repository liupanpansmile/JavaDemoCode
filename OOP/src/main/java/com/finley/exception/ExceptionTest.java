package com.finley.exception;

/**
 * Created by Administrator on 2016/3/23.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try{
            int a = 1 ;
            int b = 0 ;
            //if(b == 0) throw  new ArithmeticException("b == 0 in try") ;
            a = a/b ;
        }catch (ArithmeticException ex){
            System.out.println("b == 0 in catch");
            throw ex ;
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("Program Exit");
    }
}
