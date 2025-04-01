package com.scaler.designpatterns.Strategy;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Which Strategy do you want to use?");
        String strategy = scanner.nextLine();
        SlotAllocationStrategy slotAllocationStrategy = SlotAllocationFactory.getStrategy(strategy);
        ParkingLot parkingLot=new ParkingLot(slotAllocationStrategy);
        System.out.println(parkingLot.generateTicket());
    }
}
