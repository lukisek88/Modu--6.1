package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class World {
    private final List<Continent> listOfWorlds = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return listOfWorlds.add(continent);
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal peoplelist = listOfWorlds.stream()
                .flatMap(continent -> continent.getListContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,country) -> sum.add(country));
        return peoplelist;

    }
}
