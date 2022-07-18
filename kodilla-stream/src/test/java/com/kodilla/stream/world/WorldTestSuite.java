package com.kodilla.stream.world;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europa = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");
        Continent america = new Continent("America");
        Continent australia = new Continent("Australia and Oceania");


        Country poland = new Country("Poland");
        Country ukraine = new Country("Ukraine");
        Country japan = new Country("Japan");
        Country egypt = new Country("Egypt");
        Country usa = new Country("U.S.A");
        Country newzealand = new Country("New Zealand");


        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(africa);
        world.addContinent(america);
        world.addContinent(australia);



        europa.addCountry(poland);
        europa.addCountry(ukraine);
        asia.addCountry(japan);
        africa.addCountry(egypt);
        america.addCountry(usa);
        australia.addCountry(newzealand);




        //When

        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
          BigDecimal totalPeopleExpected = new BigDecimal("600000000");
         assertEquals(totalPeopleExpected, totalPeople);
    }
}