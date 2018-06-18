package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class America {
    private final List<Country> countriesInAmerica = new ArrayList<>();
    public America() {
        countriesInAmerica.add(new Country("United States", new BigInteger("326726000")));
        countriesInAmerica.add(new Country("Brazil", new BigInteger("208444000")));
        countriesInAmerica.add(new Country("Colombia", new BigInteger("49487000")));
        countriesInAmerica.add(new Country("Peru", new BigInteger("31488625")));
        countriesInAmerica.add(new Country("Chile", new BigInteger("18191884")));
        countriesInAmerica.add(new Country("Mexico", new BigInteger("122273473")));
    }

    public ArrayList<Country> getCountriesInAmerica() {
        return new ArrayList<Country>(countriesInAmerica);
    }
}
