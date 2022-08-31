package com.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightService {
    private FlightDb flightsDb;

    public FlightService(FlightDb flightsDb) {
        this.flightsDb = flightsDb;
    }

    public Set<Flight> availableFlightsFrom(String departureAirport) {
        return flightsDb.getAvaiableFlight().stream()
                .filter(flight -> flight.getDepartueAirport().equals(departureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> availableFlightsTo(String arrivalAirport) {
        return flightsDb.getAvaiableFlight().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<List<Flight>> availableConnectingFlights(String departureAirport, String arrivalAirport) {
        Set<List<Flight>> setOfFlights = new HashSet<>();

        flightsDb.getAvaiableFlight().stream()
                .filter(flight -> flight.getDepartueAirport().equals(departureAirport))
                .forEach(flight -> {
                    List <Flight> temp = flightsDb.getAvaiableFlight().stream()
                            .filter(fl -> (flight.getArrivalAirport().equals(fl.getDepartueAirport()) && fl.getArrivalAirport().equals(arrivalAirport)))
                            .collect(Collectors.toList());

                    if (temp.size() > 0) {
                        List<Flight> flightsRoute = new ArrayList<>();
                        flightsRoute.add(flight);
                        flightsRoute.addAll(temp);
                        setOfFlights.add(flightsRoute);
                    }
                });
        return setOfFlights;
    }


}
