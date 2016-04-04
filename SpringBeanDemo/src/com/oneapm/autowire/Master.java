package com.oneapm.autowire;

/**
 * Created by Administrator on 2016/3/31.
 */
public class Master {
    private String name ;
    private Dog d;

    public Master(Dog dog1){
        this.d = dog1 ;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getD() {
        return d;
    }

    public void setD(Dog d) {
        this.d = d;
    }
}
