package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FlightMain {
    public static void main(String[] args) {
        FlightSimulation flight =new FlightSimulation();

        ArrayList<Flight> userlist = new ArrayList<>();
        System.out.println("Enter Route List: ");
        userlist.add(new Flight("KRK","WAW"));
        userlist.add(new Flight(null,null));
        userlist.add(new Flight("GDA","KAT"));

        try {
    for (Flight a : userlist) {
       flight.findFlight(a);
    }
}catch (RouteNotFoundException e){
    System.out.println("The Route does not exit");
}
        System.out.println("");
        System.out.println("Thank u for using our services");

}
}

