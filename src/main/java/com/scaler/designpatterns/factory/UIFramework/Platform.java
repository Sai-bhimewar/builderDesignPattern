package com.scaler.designpatterns.factory.UIFramework;

import com.scaler.designpatterns.factory.UIFramework.Components.Button.Button;
import com.scaler.designpatterns.factory.UIFramework.Components.Menu.Menu;

public abstract class Platform {
//    abstract Button createButton();  // for platform this is getting crowded so move this to
//    abstract Menu createMenu();      // UIComponentFactory Interface
    abstract UIComponentFactory createUIComponentFactory();
}
