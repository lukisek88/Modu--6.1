package com.kodilla.good.patterns.flight;

public class Flight {
    private String departueAirport;
    private String arrivalAirport;

    public Flight(String departueAirport, String arrivalAirport) {
        this.departueAirport = departueAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartueAirport() {
        return departueAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!departueAirport.equals(flight.departueAirport)) return false;
        return arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int result = departueAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Lot z Lotniska: "+ departueAirport  +
                " do " + arrivalAirport;
    }
}
