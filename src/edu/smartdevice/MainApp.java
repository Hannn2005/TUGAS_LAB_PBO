package edu.smartdevice;

public class MainApp {
    public static void main(String[] args){
        SmartWatch smartWatch = new SmartWatch(10,"");

        smartWatch.infoDevice();

        smartWatch.chargeBattery(12);
        smartWatch.infoDevice();

        smartWatch.connectWifi("S-1234");
        smartWatch.infoDevice();


    }
}
