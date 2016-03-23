package com.oneapm.abstract_interface;

 abstract class Door{
    public abstract void open() ;
    protected abstract void close() ;
}

class AlarmDoor extends Door implements Alarm{

    @Override
    public void alarm() {

    }

    @Override
    public void open() {

    }

    @Override
     protected void close() {

    }
}

public class MainApp {
    public static void main(String[] args) {
        Door d  = new AlarmDoor();
        d.open() ;
        d.close();



    }

}
