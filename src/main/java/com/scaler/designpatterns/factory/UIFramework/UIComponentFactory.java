package com.scaler.designpatterns.factory.UIFramework;

import com.scaler.designpatterns.factory.UIFramework.Components.Button.Button;
import com.scaler.designpatterns.factory.UIFramework.Components.Menu.Menu;

public interface UIComponentFactory {
    abstract Button createButton();
    abstract Menu createMenu();
}
