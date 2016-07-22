package com.finley.exception;

/**
 * Created by Lpp on 2016/3/23.
 */
class ExceptionA extends Exception{
    public ExceptionA(String msg){
        super(msg);
    }
}

class ExceptionB extends ExceptionA{
    public ExceptionB(String msg){
        super(msg);
    }
}

class ExceptionC extends ExceptionA{
    public ExceptionC(String msg){
        super(msg);
    }
}
class A{
    public void f() throws ExceptionB{
        throw  new ExceptionB("f exception") ;
    }

    public void g() throws ExceptionC{
        try{
            f() ;
        }catch (ExceptionB ex){
            ExceptionC exc = new ExceptionC("g exception") ;
            exc.initCause(ex) ;
            throw exc ;
        }
    }
}

public class CaughtExceptionSaveTest {
    public static void main(String[] args) {
        A a = new A() ;
        try {
            a.g();
        } catch (ExceptionC exceptionC) {
            exceptionC.printStackTrace();
        }
    }
}
