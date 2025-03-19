package com.scaler.designpatterns.factory.UIFramework;

import com.scaler.designpatterns.factory.UIFramework.Components.Button.Button;
import com.scaler.designpatterns.factory.UIFramework.Components.Button.IOSButton;
import com.scaler.designpatterns.factory.UIFramework.Components.Menu.IOSMenu;
import com.scaler.designpatterns.factory.UIFramework.Components.Menu.Menu;

public class IOSUIComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
