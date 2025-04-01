package com.scaler.designpatterns.Strategy;

import org.springframework.boot.autoconfigure.web.WebProperties;

public class SlotAllocationFactory {
    public static SlotAllocationStrategy getStrategy(String strategy){
        SlotAllocationStrategy slotAllocationStrategy = null;
        if(strategy.equals("Nearest")){
            slotAllocationStrategy = new NearestSlotAllocationStrategy();
        }else if(strategy.equals("Farthest")){
            slotAllocationStrategy=new FarthesSlotAllocationStrategy();
        }else if(strategy.equals("Random")){
            slotAllocationStrategy=new RandomSlotAllocationStrategy();
        }
        return slotAllocationStrategy;
    }
}
