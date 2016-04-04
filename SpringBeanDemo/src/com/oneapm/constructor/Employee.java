package com.oneapm.constructor;

/**
 * Created by Administrator on 2016/3/31.
 */
public class Employee {
    private int id ;
    private String name ;

    public Employee(){}

    public Employee(int id, String name) {
        System.out.println("Employee Constructor With Two Parameters");
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
