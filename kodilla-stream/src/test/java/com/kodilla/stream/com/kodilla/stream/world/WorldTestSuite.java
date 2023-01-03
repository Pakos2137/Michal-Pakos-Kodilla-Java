package com.kodilla.stream.com.kodilla.stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    private Assertions Assert;

    @Test
    void testGetPeopleQuantity() {
        World world = new World();

        Continent europe = new Continent("Europe");
        Continent nAmerica = new Continent("North America");
        Continent asia = new Continent("Asia");

        //Europe
        Country poland = new Country("Poland", new BigDecimal(40000000));
        Country germany = new Country("Germany", new BigDecimal(80000000));
        Country france = new Country("France",new BigDecimal(70000000));

        //North America
        Country usa = new Country("USA",new BigDecimal(330000000));
        Country mexico = new Country("Mexico",new BigDecimal(130000000));
        Country canada = new Country("Canada",new BigDecimal(40000000));

        //Asia
        Country china = new Country("China",new BigDecimal(1400000000));
        Country india = new Country("India",new BigDecimal(1400000000));
        Country israel = new Country("Israel",new BigDecimal(10000000));

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(nAmerica);

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        nAmerica.addCountry(usa);
        nAmerica.addCountry(mexico);
        nAmerica.addCountry(canada);

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(israel);

        BigDecimal totalPeople = world.getPeopleQuantity();

        BigDecimal totalPeopleExpected = new BigDecimal("3500000000");

        Assert.assertEquals(totalPeopleExpected, totalPeople);
    }
}
