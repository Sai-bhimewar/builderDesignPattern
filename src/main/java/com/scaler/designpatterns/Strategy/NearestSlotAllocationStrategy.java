package com.scaler.designpatterns.Strategy;

public class NearestSlotAllocationStrategy implements SlotAllocationStrategy {
    @Override
    public int allocateSlot() {
        return 1;
    }
}
