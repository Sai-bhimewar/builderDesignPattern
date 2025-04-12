package com.scaler.designpatterns.Observer;



public interface Subject {
    public void notifyObservers();
    public void registerObserver(Obsever observer);
    public void removeObserver(Obsever observer);
}
