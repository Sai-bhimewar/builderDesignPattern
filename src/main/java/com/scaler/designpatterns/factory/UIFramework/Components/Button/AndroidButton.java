package com.scaler.designpatterns.factory.UIFramework.Components.Button;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("Android Button clicked");
    }
}
