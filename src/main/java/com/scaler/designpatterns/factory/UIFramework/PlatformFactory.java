package com.scaler.designpatterns.factory.UIFramework;

public class PlatformFactory {
    public static Platform getPlatformByName(String name) {

        Platform platform=null;
        if(name.equals("Android")){
            platform=new Android();      // add this if else in PlatformFactory class
        }else if(name.equals("IOS")){
            platform=new IOS();
        }
        return platform;
    }
}
