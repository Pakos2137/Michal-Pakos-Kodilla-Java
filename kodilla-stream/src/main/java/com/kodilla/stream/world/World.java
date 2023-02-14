package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public final class World {
    private final List<Continent> listOfContinents = new ArrayList<>();

    public boolean addContinent(Continent continent) {
        return listOfContinents.add(continent);
    }
    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantityOnTheWord = listOfContinents.stream()
                .flatMap(continent -> continent.getListOfCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO,(sum,country) -> sum.add(country));
        return peopleQuantityOnTheWord;
    }
}

