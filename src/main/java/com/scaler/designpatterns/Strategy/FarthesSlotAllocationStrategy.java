package com.scaler.designpatterns.Strategy;

public class FarthesSlotAllocationStrategy implements SlotAllocationStrategy {
    @Override
    public int allocateSlot() {
        return 100;
    }
}
