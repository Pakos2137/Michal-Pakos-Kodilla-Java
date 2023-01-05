package com.kodilla.testing.weather.stub;
import java.util.HashMap;
import java.util.Map;

public class AverageTemperature {

    private Temperatures temperatures;

    public AverageTemperature(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public double calculateForecast() {
        Map<String, Double> avgMap = new HashMap<>();

        double totalTemperature = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            totalTemperature += temperature.getValue();
        }
        //double avgTemperature = totalTemperature / 5;
        //return avgTemperature;
    }
}
