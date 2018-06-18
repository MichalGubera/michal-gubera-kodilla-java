package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public final class Asia {
    private final List<Country> countriesInAsia = new ArrayList<>();
    public Asia() {
        countriesInAsia.add(new Country("China", new BigInteger("1386790000")));
        countriesInAsia.add(new Country("India", new BigInteger("1210854977")));
        countriesInAsia.add(new Country("Pakistan", new BigInteger("207774520")));
        countriesInAsia.add(new Country("Russia", new BigInteger("146544710")));
        countriesInAsia.add(new Country("Japan", new BigInteger("126890000")));
        countriesInAsia.add(new Country("Vietnam", new BigInteger("90493352")));
    }

    public ArrayList<Country> getCountriesInAsia() {
        return new ArrayList<Country>(countriesInAsia);
    }
}
