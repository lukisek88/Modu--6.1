package com.kodilla.testing.weather.stub;

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
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        getAverage(resultMap);
        getMediana(resultMap);
        return resultMap;

    }


    public double getAverage(Map<String,Double> theAverage){
        double sum=0;
        double result;
       for(Double av: theAverage.values()){
           sum += av;
       }
        result = sum/theAverage.size();
       return result;
    }


    public double getMediana(Map<String,Double> theMediana){
        ArrayList<Double> list = new ArrayList<>(theMediana.values());
        Collections.sort(list);
        int a = list.size()/2;
        double m;
        if (list.size()%2==0)
            m = (list.get(a) + list.get(a - 1)) / 2;
        else
            m=list.get(a);
        return m;
}
}