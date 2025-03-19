package com.scaler.designpatterns.factory.UIFramework;

import com.scaler.designpatterns.factory.UIFramework.Components.Button.AndroidButton;
import com.scaler.designpatterns.factory.UIFramework.Components.Button.Button;
import com.scaler.designpatterns.factory.UIFramework.Components.Menu.AndroidMenu;
import com.scaler.designpatterns.factory.UIFramework.Components.Menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
