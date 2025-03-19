package com.scaler.designpatterns.factory.UIFramework.Components.Menu;

public class IOSMenu implements Menu {
    @Override
    public void showOptions() {
        System.out.println("IOS Menu Options");
    }
}
