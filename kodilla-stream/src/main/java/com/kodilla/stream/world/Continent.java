package com.kodilla.stream.world;

import java.util.*;

public final class Continent {
    private final List<Country> listOfContinent = new ArrayList<>();
    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListContinent() {
        return new ArrayList<>(listOfContinent);
    }

    public boolean addCountry (Country country){
        return listOfContinent.add(country);
    }
}