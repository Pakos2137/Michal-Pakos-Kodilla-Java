package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {
        Flight flight = new Flight("Wroclaw","Warszawa");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFilght(flight);
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Zakończono wyszukiwanie...");
        }
    }
}
