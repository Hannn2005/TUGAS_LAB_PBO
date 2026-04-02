package edu.smartdevice;

public class SmartWatch implements Rechargeable,Connectable {
    private int batteryLevel;
    private boolean connected;
    private String ssid;

    SmartWatch(int batteryLevel,String ssid){
        this.batteryLevel = batteryLevel;
        this.ssid = ssid;
    }

    @Override
    public void chargeBattery(int menit) {
        this.batteryLevel += menit;
       if(this.batteryLevel >= 100){this.batteryLevel = 100;}

    }

    @Override
    public int getBatteryLevel() {
        if(this.batteryLevel <0){this.batteryLevel = 0;}
        if(this.batteryLevel >100){this.batteryLevel = 100;}
        return this.batteryLevel;
    }

    @Override
    public void connectWifi(String ssid) {
      this.ssid = ssid;
      this.connected = true;
    }

    @Override
    public boolean isConnected() {
        return connected;
    }


    public void infoDevice(){
        if(this.ssid != ""){this.connected = true;}

        System.out.println("Status SmartWatch");
        System.out.println("=======================");
        System.out.printf("Battery Level  : %d%%\n",getBatteryLevel());
        System.out.println("Wifi Connected : "+isConnected());
        System.out.println("Wifi SSID      : "+this.ssid);
        System.out.println(" ");
    }
}
