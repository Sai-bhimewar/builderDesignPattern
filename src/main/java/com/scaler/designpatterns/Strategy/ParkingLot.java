package com.scaler.designpatterns.Strategy;

public class ParkingLot {
    private SlotAllocationStrategy slotAllocationStrategy;

    public ParkingLot(SlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public String generateTicket(){
        return "Ticket- "+slotAllocationStrategy.allocateSlot();
    }
}
