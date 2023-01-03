package com.kodilla.stream.world;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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

