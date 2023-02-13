package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    HashMap<String,Boolean> possibleFlight = new HashMap<>();
    FlightFinder() {
        possibleFlight = new HashMap<>();
        possibleFlight.put("Warszawa",true);
        possibleFlight.put("ZielonaGora",false);
    }
    public void findFilght(Flight flight)  throws RouteNotFoundException {
        if (! possibleFlight.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Nie znaleziono połączenia");
        } else {
            System.out.println("Znaleziono miejsce docelowe lotu:" + flight);
        }
    }
}
