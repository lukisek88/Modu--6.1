package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FlightSimulation {


    private final Map<String, Boolean> airportMap;

    public  FlightSimulation() {
        airportMap = airportDataBase();
    }
    private Map<String, Boolean> airportDataBase() {
        Map<String, Boolean> airportDataBase = new HashMap<>();
        airportDataBase.put("KRK", true);
        airportDataBase.put("WAW", true);
        airportDataBase.put("KAT", false);
        airportDataBase.put("GDA", false);


        return airportDataBase;
    }
    public void findFlight(Flight flight) throws RouteNotFoundException {
        String airport2 = flight.getArrivalAirport();
        String airport1 = flight.getDepartureAirport();
        System.out.println();

         Optional<String> a1 = Optional.ofNullable(airport1);
        Optional<String> a2 = Optional.ofNullable(airport2);
        String b1 = a1.orElse(new Flight("KRA","WAW").getArrivalAirport());
        String b2 = a2.orElse(new Flight("KRA","WAW").getArrivalAirport());

        System.out.println("Wprowdzone Dane:"+b1+" "+b2);
        if (airportMap.get(b1)&&airportMap.get(b2)== true){
            System.out.println("You Can fly from: "+b1+" to "+b2);
        }else {
            throw new RouteNotFoundException();
        }


    }



}