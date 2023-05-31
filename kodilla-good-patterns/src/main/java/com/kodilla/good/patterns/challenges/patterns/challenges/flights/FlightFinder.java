package com.kodilla.good.patterns.challenges.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    private final List<Flight> flightList = List.of(
            new Flight("Warszawa", "Karków"),
            new Flight("Warszawa", "Zielona Góra"),
            new Flight("Zielona Góra", "Berlin"),
            new Flight("Nowy Jork", "Warszawa"),
            new Flight("Warszawa", "Berlin"),
            new Flight("Berlin", "Karków"),
            new Flight("Berlin", "Nowy Jork"),
            new Flight("Barcelona", "Zielona Góra"),
            new Flight("Nowy Jork", "Barcelona")
    );

    public List<Flight> flightFinderFrom(String from) {
        List<Flight> flightListFrom = flightList.stream()
                .filter(f -> f.getFrom().equals(from))
                .collect(Collectors.toList());
        return flightListFrom;
    }
    public List<Flight> flightFinderTo(String to) {
        List<Flight> flightListTo = flightList.stream()
                .filter(f -> f.getTo().equals(to))
                .collect(Collectors.toList());
        return flightListTo;
    }
    public List<Flight> flightFinderThrough(String from, String via, String to) {
        List<Flight> flightList1 = flightList.stream()
                .filter(f -> f.getTo().equals(to) && f.getFrom().equals(via))
                .toList();

        List<Flight> flightList2 = flightList.stream()
                .filter(f -> f.getFrom().equals(from) && f.getTo().equals(via))
                .toList();

        List<Flight> allPossibleFlight = new ArrayList<>();
        allPossibleFlight.addAll(flightList1);
        allPossibleFlight.addAll(flightList2);

        return allPossibleFlight;
    }
}