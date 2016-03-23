package com.oneapm.instance;

/**
 * Created by Lpp on 2016/3/23.
 * Purpose:测试instanceof
 */

interface Alarm{
    void alarm() ;
}

class AlarmDoor implements Alarm{

    @Override
    public void alarm() {
    }
}

class IronAlarmDoor extends AlarmDoor{

}

public class InstanceofDemo {



    public static void main(String[] args) {
        Alarm alarm = null ;
        AlarmDoor alarmDoor = null ;
        boolean result ;
        System.out.println("--------------Test  1----------");
        result = alarm instanceof Alarm ;
        System.out.println("alarm instanceof Alarm :" + result);
        result = alarmDoor instanceof AlarmDoor ;
        System.out.println("alarmDoor instanceof AlarmDoor :" + result);

        alarm = new AlarmDoor() ;
        alarmDoor = new AlarmDoor() ;
        result = alarm instanceof Alarm ;
        System.out.println("--------------Test  2----------");
        System.out.println("alarm instanceof Alarm :" + result);
        result = alarmDoor instanceof AlarmDoor ;
        System.out.println("alarmDoor instanceof AlarmDoor :" + result);


        IronAlarmDoor ironAlarmDoor = new IronAlarmDoor() ;

        result = ironAlarmDoor instanceof Alarm ;
        System.out.println("--------------Test 3----------");
        System.out.println("ironAlarmDoor instanceof Alarm :" + result);
        result = ironAlarmDoor instanceof AlarmDoor ;
        System.out.println("ironAlarmDoor instanceof AlarmDoor :" + result);


    }
}
