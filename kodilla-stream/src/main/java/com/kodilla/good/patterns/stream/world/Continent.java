package com.kodilla.good.patterns.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {
    private final String continentName;
    List<Country> CountriesList = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;

    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getListOfCountries() {
        return new ArrayList<>(CountriesList);
    }
    public boolean addCountry(Country country) {
        return CountriesList.add(country);
    }
}

