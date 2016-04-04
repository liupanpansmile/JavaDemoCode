package com.oneapm.aop.methodbeforeadvice;

/**
 * Created by Administrator on 2016/4/1.
 */
public class AppSettingService implements ISerivce {
    @Override
    public String getServiceName() {
        return "appSettingService";
    }

    @Override
    public void dataStore(String data) {
        System.out.println("AppSettingService store" + data);
    }
}
