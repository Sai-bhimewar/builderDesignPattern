package com.scaler.designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;


public class WeatherData implements Subject {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Obsever> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        for (Obsever o: observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    @Override
    public void registerObserver(Obsever observer) {
        System.out.println("New Observer registered");
        observers.add(observer);
    }

    @Override
    public void removeObserver(Obsever observer) {
        System.out.println("Observer removed");
        observers.remove(observer);
    }

    public void MeasurementsChanged() {
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        MeasurementsChanged();
    }
}
