package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class Europe {
    private final List<Country> countriesInEurope = new ArrayList<>();
    public Europe() {
        countriesInEurope.add(new Country("France", new BigInteger("66259012")));
        countriesInEurope.add(new Country("Spain", new BigInteger("46449565")));
        countriesInEurope.add(new Country("Germany", new BigInteger("828000000")));
        countriesInEurope.add(new Country("Italy", new BigInteger("60788845")));
        countriesInEurope.add(new Country("Poland", new BigInteger("38484000")));
        countriesInEurope.add(new Country("Greece", new BigInteger("10816286")));
    }

    public ArrayList<Country> getCountriesInEurope() {
        return new ArrayList<Country>(countriesInEurope);
    }
}
