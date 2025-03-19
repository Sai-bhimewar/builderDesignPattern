package com.scaler.designpatterns.factory.UIFramework;

public class Android extends Platform {
    @Override
    UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
