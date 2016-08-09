package com.example.alienware.myapplication;

/**
 * Created by Alienware on 2016/8/9.
 */


public class DeviceId {
    private String DEVICE_ID;

    public DeviceId(){
        generateDeviceId();
    }


    private void generateDeviceId() {
        DEVICE_ID = new String();
        String SerialNumber = android.os.Build.SERIAL;
        DEVICE_ID = SerialNumber;
    }



    public String getDeviceId(){
        return DEVICE_ID;
    }

}
