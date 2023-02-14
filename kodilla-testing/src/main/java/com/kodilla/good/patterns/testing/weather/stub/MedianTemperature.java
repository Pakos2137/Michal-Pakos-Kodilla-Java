package com.kodilla.good.patterns.testing.weather.stub;
import java.util.ArrayList;
import java.util.*;
import java.util.Map;

public class MedianTemperature {

    private Temperatures temperatures;

    public MedianTemperature(Temperatures temperatures) {

        this.temperatures = temperatures;
    }
    ArrayList<Double> tempList = new ArrayList<>();
    public double medianCalculator() {
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            tempList.add(temperature.getValue());
        }
        Collections.sort(tempList);

        int numberOfMedianValue = tempList.size()/2;
        double median = (tempList.get(numberOfMedianValue));
        return median;
    }

}


