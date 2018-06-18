package com.kodilla.stream.world;

import java.math.BigInteger;

public final class Country {
    private final String country;
    private final BigInteger peopleQuantity;

    public Country(final String country, final BigInteger peopleQuantity) {
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountry() {
        return country;
    }

    public BigInteger getPeopleQuantity() {
        return peopleQuantity;
    }
}
