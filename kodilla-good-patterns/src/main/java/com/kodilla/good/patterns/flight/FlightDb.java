package com.kodilla.good.patterns.flight;


import java.util.Set;

public class FlightDb {
    private Set<Flight> avaiableFlight;

    public FlightDb(Set<Flight> avaiableFlight) {
        this.avaiableFlight = avaiableFlight;
    }

    public Set<Flight> getAvaiableFlight() {
        return avaiableFlight;
    }


}

