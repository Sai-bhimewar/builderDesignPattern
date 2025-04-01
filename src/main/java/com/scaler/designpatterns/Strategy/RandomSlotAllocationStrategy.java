package com.scaler.designpatterns.Strategy;

public class RandomSlotAllocationStrategy implements SlotAllocationStrategy {
    @Override
    public int allocateSlot() {
        return 55;
    }
}
