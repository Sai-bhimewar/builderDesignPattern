package com.scaler.designpatterns.Observer;


import java.util.Observer;

public class CurrStatisticsDisplay implements Obsever , Display{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject subject;

    public CurrStatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Curr Statistics Display: ");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }



    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
