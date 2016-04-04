package com.oneapm.aop.methodbeforeadvice;

/**
 * Created by Administrator on 2016/4/1.
 */
public class MetricDataService implements ISerivce {

    @Override
    public String getServiceName() {
        return "metricDataSerice";
    }

    @Override
    public void dataStore(String data)
    {
        System.out.println("MetricDataService store" + data);
        //int a = 6/0 ;
    }
}
