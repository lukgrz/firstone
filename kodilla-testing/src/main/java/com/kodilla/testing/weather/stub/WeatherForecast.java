package com.kodilla.testing.weather.stub;

import java.util.Collections.*;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAvarageTemperature() {
        double avarageTemperature;
        double sumTemperature = 0;

        for (Map.Entry<String, Double> temperature:
                temperatures.getTemperatures().entrySet()){
            sumTemperature += temperature.getValue();
        }
        avarageTemperature = sumTemperature/temperatures.getTemperatures().size();
        return avarageTemperature;
    }

    public double calculateMedianTemperature() {
        double medianTempreature;
        List<Double> ascendingOrderTemperatrues = new ArrayList<>();

        for (Map.Entry<String,Double> temperature:
                temperatures.getTemperatures().entrySet()){
            Double temperatureToList = temperature.getValue();
            ascendingOrderTemperatrues.add(temperatureToList);
            Collections.sort(ascendingOrderTemperatrues);
        }
        Collections.sort(ascendingOrderTemperatrues);

        if (ascendingOrderTemperatrues.size()%2 == 0){
            int n = ascendingOrderTemperatrues.size()/2;
            medianTempreature = (ascendingOrderTemperatrues.get(n)+
                    ascendingOrderTemperatrues.get(n-1))/2;
        } else {
            int n = ascendingOrderTemperatrues.size()/2;
            medianTempreature = ascendingOrderTemperatrues.get(n);
        }
        return medianTempreature;
    }
}
