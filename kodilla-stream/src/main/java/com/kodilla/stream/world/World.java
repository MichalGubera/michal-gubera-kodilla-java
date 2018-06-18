package com.kodilla.stream.world;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class World {
    Europe europe = new Europe();
    Asia asia = new Asia();
    America america = new America();

    private final Map<String, List<Country>> continents = new HashMap<>();
    public World() {
        continents.put("Europe", europe.getCountriesInEurope());
        continents.put("Asia", asia.getCountriesInAsia());
        continents.put("America", america.getCountriesInAmerica());
    }

    //używając flatMap() oraz reduce() obliczy sumę ludności wszystkich krajów na wszystkich kontynentach
    public BigInteger getPeopleQuantity() {
        return continents.entrySet().stream()
                .flatMap(continent -> continent.getValue().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigInteger.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
