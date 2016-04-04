package com.oneapm.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2016/3/30.
 */
public class Department {

    private String name ;
    private String[] empNames ;
    private List<Employee> empList ;
    private Set<Employee> empSet ;
    private Map<String,Employee> empMap ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getEmpNames() {
        return empNames;
    }

    public void setEmpNames(String[] empNames) {
        this.empNames = empNames;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public Set<Employee> getEmpSet() {
        return empSet;
    }

    public void setEmpSet(Set<Employee> empSet) {
        this.empSet = empSet;
    }

    public Map<String, Employee> getEmpMap() {
        return empMap;
    }

    public void setEmpMap(Map<String, Employee> empMap) {
        this.empMap = empMap;
    }
}
