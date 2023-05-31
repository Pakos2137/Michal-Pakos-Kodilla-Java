package com.kodilla.good.patterns.challenges.patterns.challenges.flights;

public class Main {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        System.out.println(flightFinder.flightFinderFrom("Warszawa"));
        System.out.println(flightFinder.flightFinderTo("Barcelona"));
        System.out.println(flightFinder.flightFinderThrough("Nowy Jork", "Warszawa", "Barcelona"));
    }
}
