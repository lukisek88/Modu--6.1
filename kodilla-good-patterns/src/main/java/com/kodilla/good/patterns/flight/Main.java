package com.kodilla.good.patterns.flight;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Flight> database = new HashSet<>();
        database.add(new Flight("WRO", "WAR"));
        database.add(new Flight("WAR", "GDA"));
        database.add(new Flight("WRO", "GDA"));
        database.add(new Flight("GDA", "NYC"));
        database.add(new Flight("WAR", "NYC"));
        database.add(new Flight("WRO", "GDA"));


FlightService base= new FlightService(new FlightDb(database));

        System.out.println("Loty Dostepne z WRO");
        System.out.println(base.availableFlightsFrom("WRO"));

        System.out.println("");

        System.out.println("Loty Dostepne do NYC");
        System.out.println(base.availableFlightsTo("NYC"));

        System.out.println("");
        System.out.println("Możliwe Połaczenie z WRO do NYC");
        System.out.println(base.availableConnectingFlights("WRO","NYC"));
    }
}
