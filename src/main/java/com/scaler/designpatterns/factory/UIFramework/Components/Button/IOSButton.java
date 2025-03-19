package com.scaler.designpatterns.factory.UIFramework.Components.Button;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("IOS Button Clicked");
    }
}
