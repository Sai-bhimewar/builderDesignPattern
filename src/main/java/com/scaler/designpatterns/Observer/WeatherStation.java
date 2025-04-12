package com.scaler.designpatterns.Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrStatisticsDisplay currStatisticsDisplay = new CurrStatisticsDisplay(weatherData);
        weatherData.setMeasurement(98.6f,40.0f,52);
        weatherData.setMeasurement(98.0f,42.0f,52);
        CurrStatisticsDisplay currStatisticsDisplay2 = new CurrStatisticsDisplay(weatherData);
        weatherData.setMeasurement(98.6f, 42.0f , 52.9f);
    }
}
