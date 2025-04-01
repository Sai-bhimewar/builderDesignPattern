package com.scaler.designpatterns.factory.UIFramework;

import com.scaler.designpatterns.factory.UIFramework.Components.Button.AndroidButton;
import com.scaler.designpatterns.factory.UIFramework.Components.Button.Button;
import com.scaler.designpatterns.factory.UIFramework.Components.Button.IOSButton;
import com.scaler.designpatterns.factory.UIFramework.Components.Menu.Menu;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Scenario 1
//        Platform platform=new Android();    //here button and menu is dependent on platform so give this
//        Button button=null;                 //responsibility to platform itself
//        if(platform instanceof Android){    //so create these abstract methods in platform class
//            button=new AndroidButton();
//        }else if(platform instanceof IOS){
//            button=new IOSButton();
//        }

//        // Scenario 2 - here we are giving platform in code
//        Platform platform=new IOS();
//        UIComponentFactory factory=platform.createUIComponentFactory();
//        Button button=factory.createButton();
//        Menu menu=factory.createMenu();
//        button.click();

        // Scenario 3 - lets say platform name comes from user
//        String name=scanner.nextLine();
//        Platform platform=null;
//        if(name.equals("Android")){
//            platform=new Android();      // add this if else in PlatformFactory class
//        }else if(name.equals("IOS")){
//            platform=new IOS();
//        }
//        UIComponentFactory factory=platform.createUIComponentFactory();
//        Menu menu=factory.createMenu();
//        Button button=factory.createButton();
//        button.click();

        // Scenario 4 - after removing if else
        String name=scanner.nextLine();

        // Simple factory to create platform object based on user input
        Platform platform=PlatformFactory.getPlatformByName(name);

        // factory method to create ui component factory object based on platform object
        UIComponentFactory factory=platform.createUIComponentFactory();

        // abstract factory to create multiple component objects
        Menu menu=factory.createMenu();
        Button button=factory.createButton();
        button.click();
        menu.showOptions();
        
    }
}
