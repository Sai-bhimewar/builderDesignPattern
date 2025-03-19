package com.scaler.designpatterns.factory.UIFramework;

public class IOS extends Platform {
    @Override
    UIComponentFactory createUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
